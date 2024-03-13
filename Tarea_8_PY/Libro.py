import random

class Libro:
    def __init__(self, titulo, autor):
        self.id = random.randint(1, 9999)  # Generate random ID between 1 and 9999
        self.titulo = titulo
        self.autor = autor
        self.rentado = False

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_titulo(self):
        return self.titulo

    def set_titulo(self, titulo):
        self.titulo = titulo

    def get_autor(self):
        return self.autor

    def set_autor(self, autor):
        self.autor = autor

    def is_rentado(self):
        return self.rentado

    def set_rentado(self, rentado):
        self.rentado = rentado

    def __str__(self):
        return f"Libro: ID: {self.id}, Título: {self.titulo}, Autor: {self.autor}, Rentado: {self.rentado}"