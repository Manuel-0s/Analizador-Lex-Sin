import os

class Archivo:
    
    def __init__(self, archivo_subido):
        self.archivo = archivo_subido
        self.nombre = archivo_subido.name

    def obtener_extension(self):
        return os.path.splitext(self.nombre)[1]

    def es_php(self):
        return self.obtener_extension() in [".php", ".txt"]

    def leer_archivo(self):
        contenido_bytes = self.archivo.read()
        contenido_texto = contenido_bytes.decode("utf-8")
        return contenido_texto  

    def obtener_info(self):
        return {
            "nombre": self.nombre,
            "extension": self.obtener_extension(),
        }