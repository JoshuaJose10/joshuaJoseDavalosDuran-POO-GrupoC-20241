import java.util.*;
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        List<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** B A N C O  D E  M E X I C O ******");
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar cuenta bancaria a usuario");
            System.out.println("3. Depositar a cuenta bancaria");
            System.out.println("4. Retirar de cuenta bancaria");
            System.out.println("5. Mostrar todos los usuarios");
            System.out.println("6. Mostrar información de un usuario");
            System.out.println("7. Listar todas las cuentas bancarias");
            System.out.println("8. Mostrar información de una cuenta bancaria");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre del usuario:");
                    String nombreUsuario = scanner.nextLine();
                    usuarios.add(new Usuario(nombreUsuario));
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del usuario:");
                    nombreUsuario = scanner.nextLine();
                    System.out.println("Ingresa el tipo de cuenta bancaria:");
                    String tipoCuenta = scanner.nextLine();
                    System.out.println("Ingresa el ID de la cuenta bancaria:");
                    int idCuenta = scanner.nextInt();
                    Usuario usuarioSeleccionado = null;
                    for (Usuario usuario : usuarios) {
                        if (usuario.getNombre().equals(nombreUsuario)) {
                            usuarioSeleccionado = usuario;
                            break;
                        }
                    }
                    if (usuarioSeleccionado != null) {
                        CuentaBancaria nuevaCuenta = new CuentaBancaria(tipoCuenta, idCuenta);
                        usuarioSeleccionado.agregarCuenta(nuevaCuenta);
                        banco.agregarCuenta(nuevaCuenta);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el ID de la cuenta bancaria:");
                    idCuenta = scanner.nextInt();
                    System.out.println("Ingresa la cantidad a depositar:");
                    double cantidad = scanner.nextDouble();
                    CuentaBancaria cuentaSeleccionada = banco.buscarCuenta(idCuenta);
                    if (cuentaSeleccionada != null) {
                        cuentaSeleccionada.depositar(cantidad);
                    } else {
                        System.out.println("Cuenta bancaria no encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el ID de la cuenta bancaria:");
                    idCuenta = scanner.nextInt();
                    System.out.println("Ingresa la cantidad a retirar:");
                    cantidad = scanner.nextDouble();
                    cuentaSeleccionada = banco.buscarCuenta(idCuenta);
                    if (cuentaSeleccionada != null) {
                        cuentaSeleccionada.retirar(cantidad);
                    } else {
                        System.out.println("Cuenta bancaria no encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("Usuarios registrados:");
                    for (Usuario usuario : usuarios) {
                        System.out.println(usuario.getNombre());
                    }
                    break;
                case 6:
                    System.out.println("Ingresa el nombre del usuario:");
                    nombreUsuario = scanner.nextLine();
                    usuarioSeleccionado = null;
                    for (Usuario usuario : usuarios) {
                        if (usuario.getNombre().equals(nombreUsuario)) {
                            usuarioSeleccionado = usuario;
                            break;
                        }
                    }
                    if (usuarioSeleccionado != null) {
                        System.out.println("Nombre del usuario: " + usuarioSeleccionado.getNombre());
                        System.out.println("Cuentas bancarias:");
                        for (CuentaBancaria cuenta : usuarioSeleccionado.getCuentas()) {
                            System.out.println(cuenta);
                        }
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;
                case 7:
                    System.out.println("Cuentas bancarias registradas:");
                    for (CuentaBancaria cuenta : banco.listarCuentas()) {
                        System.out.println(cuenta);
                    }
                    break;
                case 8:
                    System.out.println("Ingresa el ID de la cuenta bancaria:");
                    idCuenta = scanner.nextInt();
                    cuentaSeleccionada = banco.buscarCuenta(idCuenta);
                    if (cuentaSeleccionada != null) {
                        System.out.println(cuentaSeleccionada);
                    } else {
                        System.out.println("Cuenta bancaria no encontrada.");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 9.");
            }
        }
    }
}