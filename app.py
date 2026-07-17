import streamlit as st
from utils.archivo import Archivo
from utils.lexico import AnalizadorLexico
from utils.sintactico import AnalizadorSintactico

class App:
    
    def __init__(self):
        st.set_page_config(page_title="Analizador Lex-Sin", layout="wide")
        self.lexico = AnalizadorLexico()
        self.sintactico = AnalizadorSintactico()
        self.codigo = None

    def ejecutar(self):
        st.image("img\\terminal.png", width=80)
        st.title("Analizador Lexico y Sintactico")
        st.write("Esta aplicacion permite analizar codigo fuente y obtener los tokens y errores lexicos.")

        self.codigo = st.file_uploader("Suba un archivo")
        if self.codigo is not None:
            self.procesar_mostrar()
                

                                  
    def procesar_mostrar(self):  
        archivo = Archivo(self.codigo)
        
        if not archivo.es_php():
            st.warning("Solo puede analizar codigo php o texto en su defecto", icon="⚠️")
            return
        
        self.codigo = archivo.leer_archivo()
        info = archivo.obtener_info()
            
        #Metadatos del archivo 
        with st.expander("Información del archivo", on_change="rerun"):
            st.table(
                {
                    ":material/info: Nombre": info["nombre"],
                    ":material/extension: Extensión": f":green-badge[{info['extension']}]",
                },
                border="horizontal",
                width="content"
            )
            
        #Codifo fuente
        with st.expander("Codigo", expanded=True):
            st.code(self.codigo, language="php", line_numbers=True)
        
        #Seleccion de analisis
        tipo_analisis = st.pills("Tipo de analisis",["Léxico", "Sintáctico"], key="tipo_analisis")
        
        match (tipo_analisis):
            case "Léxico":
                self.mostrar_lexico()
                
            case "Sintáctico":
                self.mostrar_sintactico()
     
            case _:
                return
            
    def mostrar_sintactico(self):
        self.sintactico.analizar(self.codigo)
        
        errores = self.sintactico.errores_sintacticos()
        
        with st.expander("Árbol sintáctico", expanded=False):
            st.code(self.sintactico.obtener_arbol())
            
        if len(errores) == 0:
            st.success("No hay errores sintácticos")
        else:
            with st.expander("Errores Sintácticos", expanded=False):
                st.dataframe(errores, use_container_width=True)
            
                             
    def mostrar_lexico(self):
        self.lexico.analizar(self.codigo)
        tokens = self.lexico.obtener_tokens()
        errores = self.lexico.obtener_errores()
        
        st.subheader("Tokens")
        if len(tokens) == 0:
            st.warning("No se encontraron tokens")
        else:
            st.dataframe(tokens, use_container_width=True)

        if len(errores) == 0:
            st.success("No hay errores lexicos")
        else:
            st.subheader("Errores léxicos")
            st.dataframe(errores, use_container_width=True)
            
            
if __name__ == "__main__":
    app = App()
    app.ejecutar()