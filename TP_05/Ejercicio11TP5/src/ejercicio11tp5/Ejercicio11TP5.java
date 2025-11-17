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
public class Ejercicio11TP5 {
    public static void main(String[] args) {
        Artista artista = new Artista("Coldplay", "Pop-Rock");
        Cancion cancion = new Cancion("Yellow", artista);
        Reproductor rep = new Reproductor();

        rep.reproducir(cancion);
    }
}