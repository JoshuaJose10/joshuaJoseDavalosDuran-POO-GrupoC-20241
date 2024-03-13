
class Usuario:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cuentas = []

    def agregarCuenta(self, cuenta):
        self.cuentas.append(cuenta)

    def getNombre(self):
        return self.nombre

    def getCuentas(self):
        return self.cuentas

class CuentaBancaria:
    def __init__(self, tipo, id):
        self.tipo = tipo
        self.id = id
        self.saldo = 0.0

    def depositar(self, cantidad):
        self.saldo += cantidad

    def retirar(self, cantidad):
        if cantidad <= self.saldo:
            self.saldo -= cantidad
        else:
            print("Saldo insuficiente.")

    def getTipo(self):
        return self.tipo

    def getId(self):
        return self.id

    def getSaldo(self):
        return self.saldo

    def __str__(self):
        return f"Tipo: {self.tipo} - ID: {self.id} - Saldo: ${self.saldo:.2f}"

class Banco:
    def __init__(self):
        self.cuentas = []

    def agregarCuenta(self, cuenta):
        self.cuentas.append(cuenta)

    def buscarCuenta(self, id):
        for cuenta in self.cuentas:
            if cuenta.getId() == id:
                return cuenta
        return None

    def listarCuentas(self):
        return self.cuentas

# Función para imprimir un menú y obtener la opción del usuario
def obtenerOpcion():
    while True:
        print("****** B A N C O  D E  M E X I C O ******")
        print("Selecciona una opción:")
        print("1. Registrar usuario")
        print("2. Registrar cuenta bancaria a usuario")
        print("3. Depositar a cuenta bancaria")
        print("4. Retirar de cuenta bancaria")
        print("5. Mostrar todos los usuarios")
        print("6. Mostrar información de un usuario")
        print("7. Listar todas las cuentas bancarias")
        print("8. Mostrar información de una cuenta bancaria")
        print("9. Salir")

        opcion = input()
        try:
            opcion = int(opcion)
            if 1 <= opcion <= 9:
                return opcion
            else:
                print("Opción no válida. Por favor, selecciona una opción del 1 al 9.")
        except ValueError:
            print("Opción no válida. Por favor, introduce un número del 1 al 9.")

# Función principal
def main():
    banco = Banco()
    usuarios = []

    while True:
        opcion = obtenerOpcion()

        # Manejo de las diferentes opciones del menú
        if opcion == 1:
            nombreUsuario = input("Ingresa el nombre del usuario: ")
            usuarios.append(Usuario(nombreUsuario))

        elif opcion == 2:
            nombreUsuario = input("Ingresa el nombre del usuario: ")
            tipoCuenta = input("Ingresa el tipo de cuenta bancaria: ")
            idCuenta = int(input("Ingresa el ID de la cuenta bancaria: "))

            usuarioEncontrado = False
            for usuario in usuarios:
                if usuario.getNombre() == nombreUsuario:
                    usuarioEncontrado = True
                    usuario.agregarCuenta(CuentaBancaria(tipoCuenta, idCuenta))
                    banco.agregarCuenta(CuentaBancaria(tipoCuenta, idCuenta))
                    break

            if not usuarioEncontrado:
                print("Usuario no encontrado.")

        elif opcion == 3:
            idCuenta = int(input("Ingresa el ID de la cuenta bancaria: "))
            cantidad = float(input("Ingresa la cantidad a depositar: "))

            cuentaSeleccionada = banco.buscarCuenta(idCuenta)
            if cuentaSeleccionada:
                cuentaSeleccionada.depositar(cantidad)
            else:
                print("Cuenta bancaria no encontrada.")

        elif opcion == 4:
            idCuenta = int(input("Ingresa el ID de la cuenta bancaria: "))
            cantidad = float(input("Ingresa la cantidad a retirar: "))

            cuentaSeleccionada = banco.buscarCuenta(idCuenta)
            if cuentaSeleccionada:
                cuentaSeleccionada.retirar(cantidad)
            else:
                print("Cuenta bancaria no encontrada.")

        elif opcion == 5:
            print("Usuarios registrados:")
            for usuario in usuarios:
                print(f"- {usuario.getNombre()}")

            cuentas = usuario.getCuentas()
            if cuentas:
                print("  Cuentas:")
                for cuenta in cuentas:
                    print(f"    - {cuenta}")
            else:
                print("  No tiene cuentas bancarias registradas.")

        elif opcion == 6:
            nombreUsuario = input("Ingresa el nombre del usuario: ")

            usuarioEncontrado = False
            for usuario in usuarios:
                if usuario.getNombre() == nombreUsuario:
                    usuarioEncontrado = True
                    print(f"Nombre del usuario: {usuario.getNombre()}")
                    print("Cuentas bancarias:")
                    for cuenta in usuario.getCuentas():
                        print(cuenta)
                    break

            if not usuarioEncontrado:
                print("Usuario no encontrado.")

        elif opcion == 7:
            print("Cuentas bancarias registradas:")
            for cuenta in banco.listarCuentas():
                print(cuenta)

        elif opcion == 8:
            idCuenta = int(input("Ingresa el ID de la cuenta bancaria: "))

            cuentaSeleccionada = banco.buscarCuenta(idCuenta)
            if cuentaSeleccionada:
                print(cuentaSeleccionada)
            else:
                print("Cuenta bancaria no encontrada.")

        elif opcion == 9:
            print("Saliendo...")
            break

# Ejecución de la función principal
if __name__ == "__main__":
    main()