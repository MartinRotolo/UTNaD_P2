/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio13TP5 {
    public static void main(String[] args) {
        Usuario user = new Usuario("Martín", "martin@mail.com");
        GeneradorQR gen = new GeneradorQR();

        gen.generar("QR-123456", user);
    }
}