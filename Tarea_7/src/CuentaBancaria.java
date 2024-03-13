public class CuentaBancaria {
    String tipo;
    int id;
    double saldo;

    public CuentaBancaria(String tipo, int id) {
        if (!tipo.equals("A") && !tipo.equals("B") && !tipo.equals("C")) {
            throw new IllegalArgumentException("Tipo de cuenta inválido. Debe ser 'A', 'B' o 'C'.");
        }
        this.tipo = tipo;
        this.id = id;
        this.saldo = 0;
    }

    public int getId() {
        return id;
    }

    public void depositar(double cantidad) {
        if (tipo.equals("A") && saldo + cantidad > 50000 ||
                tipo.equals("B") && saldo + cantidad > 100000) {
            System.out.println("No se puede depositar esta cantidad, supera el límite de la cuenta.");
        } else {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        double saldoMinimo = tipo.equals("A") ? 1000 : tipo.equals("B") ? 5000 : 10000;
        if (saldo - cantidad < saldoMinimo) {
            System.out.println("No se puede retirar esta cantidad, el saldo mínimo de la cuenta sería insuficiente.");
        } else {
            saldo -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "El número de cuenta del empleado es " + id + ", su saldo es " + saldo + ", y la cuenta es tipo " + tipo;
    }

}
