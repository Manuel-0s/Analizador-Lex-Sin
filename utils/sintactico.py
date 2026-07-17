from antlr4 import InputStream, CommonTokenStream, TerminalNode
from parser_antlr.ExprLexer import ExprLexer
from parser_antlr.ExprParser import ExprParser
from antlr4.error.ErrorListener import ErrorListener

class ErroresSintactico(ErrorListener):

    def __init__(self):
        self.lista = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.lista.append({
            "mensaje": msg,
            "linea": line,
            "columna": column
        })

class AnalizadorSintactico:

    def __init__(self):
        self.parser = None
        self.arbol = None
        self.errores = ErroresSintactico()

    def analizar(self, codigo):
        entrada = InputStream(codigo)

        lexer = ExprLexer(entrada)
        tokens = CommonTokenStream(lexer)

        self.parser = ExprParser(tokens)
        self.parser.removeErrorListeners()
        self.parser.addErrorListener(self.errores)

        self.arbol = self.parser.root()
        tokens.fill()
        
    def construir_nodo(self, nodo, lineas, prefix="", es_ultimo=True, es_raiz=True):
        
        if isinstance(nodo, TerminalNode):
            etiqueta = nodo.getText()
        else:
            etiqueta = self.parser.ruleNames[nodo.getRuleIndex()]
            
        if es_raiz:
            lineas.append(etiqueta)
        else:
            conector = "└── " if es_ultimo else "├── "
            lineas.append(f"{prefix}{conector}{etiqueta}")

        if isinstance(nodo, TerminalNode):
            return

        if es_raiz:
            nuevo_prefix = ""
        else:
            nuevo_prefix = prefix + ("    " if es_ultimo else "│   ")

        total_hijos = nodo.getChildCount()
  
        for i in range(total_hijos):
            hijo = nodo.getChild(i)
            ultimo_hijo = (i == total_hijos - 1)
            
            self.construir_nodo(hijo, lineas, nuevo_prefix, ultimo_hijo, es_raiz=False)

    def obtener_arbol(self):
        if self.arbol is None:
            return ""
        
        lineas_arbol = []
        self.construir_nodo(self.arbol, lineas_arbol)
        
        return "\n".join(lineas_arbol)

    def errores_sintacticos(self):
        return self.errores.lista