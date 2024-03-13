import java.util.*;
public class Usuario {
    String nombre;
    List<CuentaBancaria> cuentas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }
}
