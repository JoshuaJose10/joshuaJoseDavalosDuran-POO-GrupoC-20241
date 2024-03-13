import random

class Usuario:
    def __init__(self, nombre):
        self.id = random.randint(1, 9999)  # Genera un número aleatorio entre 1 y 9999
        self.nombre = nombre
        self.libros_rentados = []

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_libros_rentados(self):
        return self.libros_rentados

    def set_libros_rentados(self, libros_rentados):
        self.libros_rentados = libros_rentados

    def __str__(self):
        return f"Usuario: ID: {self.id}, Nombre: {self.nombre}, Libros Rentados: {len(self.libros_rentados)}"