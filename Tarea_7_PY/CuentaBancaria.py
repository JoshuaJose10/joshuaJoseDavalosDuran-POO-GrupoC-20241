class CuentaBancaria:
    def __init__(self, tipo, id):
        if tipo not in ("A", "B", "C"):
            raise ValueError("Tipo de cuenta inválido. Debe ser 'A', 'B' o 'C'.")
        self.tipo = tipo
        self.id = id
        self.saldo = 0.0

    def getId(self):
        return self.id

    def depositar(self, cantidad):
        if self.tipo == "A" and self.saldo + cantidad > 50000:
            print("No se puede depositar esta cantidad, supera el límite de la cuenta.")
        elif self.tipo == "B" and self.saldo + cantidad > 100000:
            print("No se puede depositar esta cantidad, supera el límite de la cuenta.")
        else:
            self.saldo += cantidad

    def retirar(self, cantidad):
        saldo_minimo = 1000 if self.tipo == "A" else 5000 if self.tipo == "B" else 10000
        if self.saldo - cantidad < saldo_minimo:
            print("No se puede retirar esta cantidad, el saldo mínimo de la cuenta sería insuficiente.")
        else:
            self.saldo -= cantidad

    def __str__(self):
        return f"Número de cuenta: {self.id} - Saldo: ${self.saldo:.2f} - Tipo: {self.tipo}"