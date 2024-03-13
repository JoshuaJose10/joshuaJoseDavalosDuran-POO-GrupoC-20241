class Usuario:
    def __init__(self, nombre):
        self.id = None
        self.nombre = nombre
        self.libros_rentados = []

    def __str__(self):
        return f"{self.id}: {self.nombre}"

class Libro:
    def __init__(self, titulo, autor):
        self.id = None
        self.titulo = titulo
        self.autor = autor
        self.rentado = False

    def __str__(self):
        return f"{self.id}: {self.titulo}, {self.autor}"

class Libreria:
    def __init__(self):
        self.usuarios = []
        self.libros = []

    def registrarUsuario(self, usuario):
        usuario.id = len(self.usuarios) + 1
        self.usuarios.append(usuario)

    def registrarLibro(self, libro):
        libro.id = len(self.libros) + 1
        self.libros.append(libro)

    def rentarLibro(self, usuario, libro):
        if libro.rentado:
            print("Libro no disponible para renta.")
            return
        usuario.libros_rentados.append(libro)
        libro.rentado = True

    def listarUsuarios(self):
        for usuario in self.usuarios:
            print(usuario)

    def listarLibros(self):
        for libro in self.libros:
            print(libro)

    def listarUsuariosConRentas(self):
        for usuario in self.usuarios:
            if usuario.libros_rentados:
                print(usuario)

    def listarLibrosNoRentados(self):
        for libro in self.libros:
            if not libro.rentado:
                print(libro)

    def listarLibrosRentados(self):
        for libro in self.libros:
            if libro.rentado:
                print(libro)

if __name__ == "__main__":
    libreria = Libreria()

    while True:
        print("********** L I B R E R I A **********")
        print("Selecciona una opción:")
        print("1. Registrar usuario")
        print("2. Registrar libro")
        print("3. Rentar libro")
        print("4. Listar usuarios")
        print("5. Listar libros")
        print("6. Listar usuarios con rentas")
        print("7. Listar libros no rentados")
        print("8. Listar libros rentados")
        print("9. Salir")

        try:
            opcion = int(input("Ingresa tu opción: "))
        except ValueError:
            print("Opción inválida. Por favor, ingresa un número del 1 al 9.")
            continue

        if opcion == 1:
            nombre_usuario = input("Ingresa el nombre del usuario: ")
            usuario = Usuario(nombre_usuario)
            libreria.registrarUsuario(usuario)
            print("Usuario registrado con éxito.")
        elif opcion == 2:
            titulo_libro = input("Ingresa el título del libro: ")
            autor_libro = input("Ingresa el autor del libro: ")
            libro = Libro(titulo_libro, autor_libro)
            libreria.registrarLibro(libro)
            print("Libro registrado con éxito.")
        elif opcion == 3:
            id_usuario = int(input("Ingresa el ID del usuario: "))
            id_libro = int(input("Ingresa el ID del libro: "))
            usuario = None
            libro = None
            for u in libreria.usuarios:
                if u.id == id_usuario:
                    usuario = u
                    break
            for l in libreria.libros:
                if l.id == id_libro:
                    libro = l
                    break
            if usuario and libro:
                libreria.rentarLibro(usuario, libro)
                print("Libro rentado con éxito.")
            else:
                print("Usuario o libro no encontrado.")
        elif opcion == 4:
            libreria.listarUsuarios()
        elif opcion == 5:
            libreria.listarLibros()
        elif opcion == 6:
            libreria.listarUsuariosConRentas()
        elif opcion == 7:
            libreria.listarLibrosNoRentados()
        elif opcion == 8:
            libreria.listarLibrosRentados()
        elif opcion == 9:
            print("Saliendo...")
