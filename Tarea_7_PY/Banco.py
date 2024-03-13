class Banco:
    def __init__(self):
        self.cuentas = []

    def agregarCuenta(self, cuenta):
        self.cuentas.append(cuenta)

    def listarCuentas(self):
        return self.cuentas

    def buscarCuenta(self, id):
        for cuenta in self.cuentas:
            if cuenta.getId() == id:
                return cuenta
        return None