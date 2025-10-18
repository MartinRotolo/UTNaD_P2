/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio1TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("X123456", "2025-05-01", "foto.jpg", "JPG");
        Titular titular = new Titular("Ana López", "40352878");

        pasaporte.setTitular(titular);

        System.out.println("Titular: " + titular.getNombre() +
                " — Pasaporte Nº " + titular.getPasaporte().getNumero() +
                " — Foto: " + pasaporte.getFoto().getImagen());
    }
    
}
