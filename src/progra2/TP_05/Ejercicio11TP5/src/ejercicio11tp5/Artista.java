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
public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre; this.genero = genero;
    }
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
}