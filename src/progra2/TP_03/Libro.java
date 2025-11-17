
package TP_03;

public class Libro {
     private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    // Setter con validación 
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion <= 0) {
            System.out.println("Año inválido (" + anioPublicacion + "). Se mantiene: " + this.anioPublicacion);
            return;
        }
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo() {
        System.out.printf("Libro: \"%s\" de %s (%d)%n", titulo, autor, anioPublicacion);
    }
}
