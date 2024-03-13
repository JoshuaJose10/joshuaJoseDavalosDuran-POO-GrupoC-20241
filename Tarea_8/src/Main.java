import java.util.*;
public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        System.out.println("********** L I B R E R I A **********");

        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar libro");
            System.out.println("3. Rentar libro");
            System.out.println("4. Listar usuarios");
            System.out.println("5. Listar libros");
            System.out.println("6. Listar usuarios con rentas");
            System.out.println("7. Listar libros no rentados");
            System.out.println("8. Listar libros rentados");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre del usuario:");
                    String nombreUsuario = scanner.nextLine();
                    libreria.registrarUsuario(new Usuario(nombreUsuario));
                    break;
                case 2:
                    System.out.println("Ingresa el título del libro:");
                    String tituloLibro = scanner.nextLine();
                    System.out.println("Ingresa el autor del libro:");
                    String autorLibro = scanner.nextLine();
                    libreria.registrarLibro(new Libro(tituloLibro, autorLibro));
                    break;
                case 3:
                    System.out.println("Ingresa el ID del usuario:");
                    int idUsuario = scanner.nextInt();
                    System.out.println("Ingresa el ID del libro:");
                    int idLibro = scanner.nextInt();
                    Usuario usuarioSeleccionado = null;
                    Libro libroSeleccionado = null;
                    for (Usuario usuario : libreria.listarUsuarios()) {
                        if (usuario.getId() == idUsuario) {
                            usuarioSeleccionado = usuario;
                            break;
                        }
                    }
                    for (Libro libro : libreria.listarLibros()) {
                        if (libro.getId() == idLibro) {
                            libroSeleccionado = libro;
                            break;
                        }
                    }
                    if (usuarioSeleccionado != null && libroSeleccionado != null) {
                        libreria.rentarLibro(usuarioSeleccionado, libroSeleccionado);
                        System.out.println("Libro rentado con éxito.");
                    } else {
                        System.out.println("Usuario o libro no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Usuarios registrados:");
                    for (Usuario usuario : libreria.listarUsuarios()) {
                        System.out.println(usuario.getId() + ": " + usuario.getNombre());
                    }
                    break;
                case 5:
                    System.out.println("Libros registrados:");
                    for (Libro libro : libreria.listarLibros()) {
                        System.out.println(libro.getId() + ": " + libro.getTitulo() + ", " + libro.getAutor());
                    }
                    break;
                case 6:
                    System.out.println("Usuarios con rentas:");
                    for (Usuario usuario : libreria.listarUsuariosConRentas()) {
                        System.out.println(usuario.getId() + ": " + usuario.getNombre());
                    }
                    break;
                case 7:
                    System.out.println("Libros no rentados:");
                    for (Libro libro : libreria.listarLibrosNoRentados()) {
                        System.out.println(libro.getId() + ": " + libro.getTitulo() + ", " + libro.getAutor());
                    }
                    break;
                case 8:
                    System.out.println("Libros rentados:");
                    for (Libro libro : libreria.listarLibrosRentados()) {
                        System.out.println(libro.getId() + ": " + libro.getTitulo() + ", " + libro.getAutor());
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