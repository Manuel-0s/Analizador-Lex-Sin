import streamlit as st
from utils.archivo import Archivo
from utils.lexico import AnalizadorLexico


class App:
    def __init__(self):
        st.set_page_config(page_title="Analizador Lex-Sin", layout="centered")
        self.analizador = AnalizadorLexico()

    def ejecutar(self):
        st.image("img\\terminal.png", width=80)
        st.title("Analizador Lexico y Sintactico")
        st.write("Esta aplicacion permite analizar codigo fuente y obtener los tokens y errores lexicos.")
        
        metodo_entrada = st.pills("Metodo de entrada", ["Subir archivo", "Ingresar codigo"], key="metodo_entrada")
        
        if metodo_entrada == "Ingresar codigo":
            self.codigo = st.text_area("Ingrese el codigo", height=300)
            
        if metodo_entrada == "Subir archivo":
            codigo = st.file_uploader("Suba un archivo")
            if codigo is not None:
                self.mostrar(codigo)
      
    def mostrar(self, codigo):
        archivo = Archivo(codigo)
        
        if not archivo.es_php():
            st.warning("Solo puede analizar codigo php o texto en su defecto", icon="⚠️")
            return
        
        codigo = archivo.leer_archivo()
        info = archivo.obtener_info()
        
        col1, col2 = st.columns([3, 1])
        
        with col1:
            st.subheader("Codigo original")
            st.code(codigo, language="php")
        
        with col2:
            st.subheader("Informacion")
            st.write("Nombre:", info["nombre"])
            st.write("Extension:", info["extension"])
            
        self.analizador.analizar(codigo)

        tokens = self.analizador.obtener_tokens()
        errores = self.analizador.obtener_errores()

        st.subheader("Tokens")

        if len(tokens) == 0:
            st.warning("No se encontraron tokens")
        else:
            st.dataframe(tokens, use_container_width=True)

        st.subheader("Errores lexicos")

        if len(errores) == 0:
            st.success("No hay errores lexicos")
        else:
            st.dataframe(errores, use_container_width=True)
        

if __name__ == "__main__":
    app = App()
    app.ejecutar()