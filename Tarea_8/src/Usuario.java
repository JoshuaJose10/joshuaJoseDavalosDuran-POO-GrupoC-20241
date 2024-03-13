import java.util.*;
public class Usuario {
    int id;
    String nombre;
    List<Libro> librosRentados;

    public Usuario(String nombre) {
        this.id = new Random().nextInt(9999) + 1; // Genera un número aleatorio entre 1 y 9999
        this.nombre = nombre;
        this.librosRentados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.util.List<Libro> getLibrosRentados() {
        return librosRentados;
    }

    public void setLibrosRentados(java.util.List<Libro> librosRentados) {
        this.librosRentados = librosRentados;
    }
}
