import java.util.*;
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    boolean rentado;

    public Libro(String titulo, String autor) {
        this.id = new Random().nextInt(9999) + 1; // Genera un número aleatorio entre 1 y 9999
        this.titulo = titulo;
        this.autor = autor;
        this.rentado = false;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public java.lang.String getAutor() {
        return autor;
    }

    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }

    public boolean isRentado() {
        return rentado;
    }

    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }
}

