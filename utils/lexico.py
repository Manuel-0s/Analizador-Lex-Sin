from antlr4 import InputStream, CommonTokenStream, Token
from antlr4.error.ErrorListener import ErrorListener
from parser_antlr.ExprLexer import ExprLexer

class ErroresLexicos(ErrorListener):

    def __init__(self):
        self.lista = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg
        })


class AnalizadorLexico:

    def __init__(self):
        self.lexer = None
        self.tokens = None
        self.errores = ErroresLexicos()

    def analizar(self, codigo):

        # Convertimos el texto en entrada para ANTLR
        entrada = InputStream(codigo)

        # Creamos el lexer
        self.lexer = ExprLexer(entrada)

        # Quitamos los errores normales de ANTLR
        self.lexer.removeErrorListeners()

        # Agregamos nuestro capturador de errores
        self.lexer.addErrorListener(self.errores)

        # Creamos el flujo de tokens
        self.tokens = CommonTokenStream(self.lexer)

        # Leemos todos los tokens
        self.tokens.fill()

    def obtener_tokens(self):
        resultado = []

        # Recorremos todos los tokens
        for token in self.tokens.tokens:

            if token.type == Token.EOF: 
                continue

            # Obtenemos el nombre del token
            nombre_token = self.lexer.symbolicNames[token.type]

            # Agregamos el token a la lista
            resultado.append({
                "lexema": token.text,
                "token": nombre_token,
                "linea": token.line,
                "tipo": token.type,
                "columna": token.column
            })

        return resultado

    # Metodo para obtener errores lexicos
    def obtener_errores(self):
        return self.errores.lista   