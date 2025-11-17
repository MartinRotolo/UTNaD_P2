
package ejercicio3tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio3TP5 {
    public static void main(String[] args) {
        Autor autor = new Autor("Cortázar", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Rayuela", "978-84-376-0494-7", autor, editorial);

        System.out.println(libro.getTitulo() + " — " + libro.getAutor().getNombre() +
                " (" + libro.getEditorial().getNombre() + ")");
    }
}