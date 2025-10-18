/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio6TP5 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucía", "223-4567890");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("15/10/2025", "21:00", cliente, mesa);

        System.out.println("Reserva de " + reserva.getCliente().getNombre() +
                " en mesa " + reserva.getMesa().getNumero() +
                " (" + reserva.getMesa().getCapacidad() + " personas)");
    }
}