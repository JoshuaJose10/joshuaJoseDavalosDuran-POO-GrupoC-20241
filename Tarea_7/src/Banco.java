import java.util.*;
public class Banco {
    List<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public List<CuentaBancaria> listarCuentas() {
        return cuentas;
    }

    public CuentaBancaria buscarCuenta(int id) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getId() == id) {
                return cuenta;
            }
        }
        return null;
    }
}
