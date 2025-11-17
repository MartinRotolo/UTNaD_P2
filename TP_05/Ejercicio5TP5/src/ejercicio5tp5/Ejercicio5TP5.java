/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio5TP5 {
    public static void main(String[] args) {
        Computadora pc = new Computadora("HP", "SN-123", "ASUS-Prime", "B550");
        Propietario prop = new Propietario("Lucas Fernández", "40222888");

        pc.setPropietario(prop);

        System.out.println("Propietario: " + prop.getNombre() +
                " — Computadora: " + prop.getComputadora().getMarca() +
                " — Placa: " + pc.getPlacaMadre().getModelo());
    }
}