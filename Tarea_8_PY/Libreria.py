
class Libreria:
    def __init__(self):
        self.libros = []
        self.usuarios = []

    def registrar_usuario(self, usuario):
        self.usuarios.append(usuario)

    def registrar_libro(self, libro):
        self.libros.append(libro)

    def rentar_libro(self, usuario, libro):
        if not libro.is_rentado():
            usuario.libros_rentados.append(libro)
            libro.set_rentado(True)

    def listar_usuarios(self):
        return self.usuarios

    def listar_libros(self):
        return self.libros

    def listar_usuarios_con_rentas(self):
        return [usuario for usuario in self.usuarios if usuario.libros_rentados]

    def listar_libros_no_rentados(self):
        return [libro for libro in self.libros if not libro.is_rentado()]

    def listar_libros_rentados(self):
        return [libro for libro in self.libros if libro.is_rentado()]