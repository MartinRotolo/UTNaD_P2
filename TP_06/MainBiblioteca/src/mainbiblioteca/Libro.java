package mainbiblioteca;

/**
 *
 * @author Martin
 */
public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null || isbn.isEmpty()) {
            isbn = "SIN_ISBN";
        }
        if (titulo == null || titulo.isEmpty()) {
            titulo = "Sin título";
        }
        if (autor == null) {
            autor = new Autor("A00", "Desconocido", "N/D");
        }
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("Libro[" + isbn + "] \"" + titulo + "\" ("
                + anioPublicacion + ") — " + autor);
    }
}
