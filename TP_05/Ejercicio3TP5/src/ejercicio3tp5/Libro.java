/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3tp5;

/**
 *
 * @author Martin
 */
// Asociación unidireccional a Autor + Agregación con Editorial
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;       // asociación →
    private Editorial editorial; // agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo; this.isbn = isbn; this.autor = autor; this.editorial = editorial;
    }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
}