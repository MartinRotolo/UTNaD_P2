/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbiblioteca;

/**
 *
 * @author Martin
 */
import java.util.List;

public class MainBiblioteca {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A01", "Julio Cortázar", "Argentina");
        Autor a2 = new Autor("A02", "Italo Calvino", "Italia");
        Autor a3 = new Autor("A03", "Ursula K. Le Guin", "EE.UU.");

        b.agregarLibro("ISBN-001", "Rayuela", 1963, a1);
        b.agregarLibro("ISBN-002", "Las ciudades invisibles", 1972, a2);
        b.agregarLibro("ISBN-003", "El castillo de los destinos cruzados", 1973, a2);
        b.agregarLibro("ISBN-004", "The Left Hand of Darkness", 1969, a3);
        b.agregarLibro("ISBN-005", "Cronopios y Famas", 1962, a1);

        System.out.println("== LISTADO DE LIBROS ==");
        b.listarLibros();

        System.out.println("\n== BUSCAR ISBN-004 ==");
        Libro l = b.buscarLibroPorIsbn("ISBN-004");
        if (l != null) {
            l.mostrarInfo();
        }

        System.out.println("\n== FILTRAR AÑO 1972 ==");
        List<Libro> lista = b.filtrarLibrosPorAnio(1972);
        for (Libro li : lista) {
            li.mostrarInfo();
        }

        System.out.println("\n== ELIMINAR ISBN-003 ==");
        b.eliminarLibro("ISBN-003");
        b.listarLibros();

        System.out.println("\n== TOTAL DE LIBROS ==");
        System.out.println(b.obtenerCantidadLibros());

        System.out.println("\n== AUTORES DISPONIBLES ==");
        b.mostrarAutoresDisponibles();
    }
}
