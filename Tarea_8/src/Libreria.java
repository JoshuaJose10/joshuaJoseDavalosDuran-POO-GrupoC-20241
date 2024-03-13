import java.util.*;
public class Libreria {
    List<Libro> libros;
    List<Usuario> usuarios;

    public Libreria() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    void rentarLibro(Usuario usuario, Libro libro) {
        if (!libro.rentado) {
            usuario.librosRentados.add(libro);
            libro.rentado = true;
        }
    }

    List<Usuario> listarUsuarios() {
        return usuarios;
    }

    List<Libro> listarLibros() {
        return libros;
    }

    List<Usuario> listarUsuariosConRentas() {
        List<Usuario> resultado = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (!usuario.librosRentados.isEmpty()) {
                resultado.add(usuario);
            }
        }
        return resultado;
    }

    List<Libro> listarLibrosNoRentados() {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.rentado) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    List<Libro> listarLibrosRentados() {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.rentado) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
}
