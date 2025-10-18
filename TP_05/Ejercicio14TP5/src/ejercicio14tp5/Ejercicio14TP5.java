/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio14TP5 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Promocional", 5);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}