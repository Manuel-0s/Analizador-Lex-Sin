import os

class Archivo:
    
    def __init__(self, archivo_subido):
        self.archivo = archivo_subido
        self.nombre = archivo_subido.name

    # obtener la extension
    def obtener_extension(self):
        return os.path.splitext(self.nombre)[1]

    # Validar extension
    def es_php(self):
        return self.obtener_extension() in [".php", ".txt"]

    # Leer el contenido del archivo
    def leer_archivo(self):
        
        # Leemos el archivo como bytes
        contenido_bytes = self.archivo.read()

        # Convertimos los bytes a texto
        contenido_texto = contenido_bytes.decode("utf-8")

        # Retornamos el texto del archivo
        return contenido_texto

    # Obtener informacion del archivo
    def obtener_info(self):
        return {
            "nombre": self.nombre,
            "extension": self.obtener_extension(),
        }