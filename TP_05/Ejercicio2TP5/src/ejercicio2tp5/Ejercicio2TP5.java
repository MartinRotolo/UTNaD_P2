/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio2TP5 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Samsung-X", 4000);
        Celular cel = new Celular("IMEI123", "Samsung", "A52", bateria);
        Usuario user = new Usuario("Martín", "40352878");

        cel.setUsuario(user);

        System.out.println(user.getNombre() + " usa un " + cel.getMarca() +
                " con batería " + cel.getBateria().getModelo());
    }
}