import streamlit as st
from utils.archivo import Archivo
from utils.lexico import AnalizadorLexico

class App:
    def __init__(self):
        st.set_page_config(page_title="Analizador Lex-Sin", layout="wide")
        self.lexico = AnalizadorLexico()

    def ejecutar(self):
        st.image("img\\terminal.png", width=80)
        st.title("Analizador Lexico y Sintactico")
        st.write("Esta aplicacion permite analizar codigo fuente y obtener los tokens y errores lexicos.")
        
        metodo_entrada = st.pills("Metodo de entrada", ["Subir archivo", "Ingresar codigo"], key="metodo_entrada")
        
        match metodo_entrada:
            case "Subir archivo":
                codigo = st.file_uploader("Suba un archivo")
                if codigo is not None:
                    self.procesar_mostrar(codigo)
                
            case "Ingresar codigo":       
                self.codigo = st.text_area("Ingrese el codigo", height=300)
                        
            case _:
                return
            
                                
    def procesar_mostrar(self, codigo):  
        archivo = Archivo(codigo)
        
        if not archivo.es_php():
            st.warning("Solo puede analizar codigo php o texto en su defecto", icon="⚠️")
            return
        
        codigo = archivo.leer_archivo()
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
        st.code(codigo, language="php", line_numbers=True)
        
        #Seleccion de analisis
        tipo_analisis = st.pills("Tipo de analisis",["Léxico", "Sintáctico ", "Semántico"], key="tipo_analisis")
        
        match (tipo_analisis):
            case "Léxico":
                self.mostrar_lexico(codigo)
                
            case "Sintactico":
                print("Sintactico")
            
            case "Semántico":
                print("Semántico")
            
            case _:
                return
                     
    def mostrar_lexico(self, codigo):
        self.lexico.analizar(codigo)
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