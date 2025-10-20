package mainbiblioteca;

/**
 *
 * @author Martin
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Biblioteca";
        }
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
    }

    // Composición: crea el Libro internamente
    public void agregarLibro(String isbn, String titulo, int anio, Autor autor) {
        Libro l = new Libro(isbn, titulo, anio, autor);
        libros.add(l);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("(Sin libros)");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<Libro>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public void mostrarAutoresDisponibles() {
        List<String> autoresMostrados = new ArrayList<>();
        for (Libro l : libros) {
            String autor = l.getAutor().toString();
            // Si el autor todavía no está en la lista, lo mostramos y lo agregamos
            if (!autoresMostrados.contains(autor)) {
                System.out.println("- " + autor);
                autoresMostrados.add(autor);
            }
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }
}
