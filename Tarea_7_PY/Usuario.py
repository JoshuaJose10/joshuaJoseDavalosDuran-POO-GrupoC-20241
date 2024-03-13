class Usuario:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cuentas = []

    def agregarCuenta(self, cuenta):
        self.cuentas.append(cuenta)

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getCuentas(self):
        return self.cuentas

    def setCuentas(self, cuentas):
        self.cuentas = cuentas

    def __str__(self):
        return f"Nombre: {self.nombre} - Cuentas: {self.cuentas}"