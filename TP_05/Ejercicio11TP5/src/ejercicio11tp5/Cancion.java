/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11tp5;

/**
 *
 * @author Martin
 */
public class Cancion {
    private String titulo;
    private Artista artista; // asociación →

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo; this.artista = artista;
    }
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
}