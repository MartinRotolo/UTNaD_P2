/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio4TP5 {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander", "30-12345678-9");
        Tarjeta tarjeta = new Tarjeta("5555-8888-9999-0000", "12/27", banco);
        Cliente cliente = new Cliente("María Pérez", "40444555");

        tarjeta.setCliente(cliente);

        System.out.println("Cliente: " + cliente.getNombre() +
                " — Banco: " + tarjeta.getBanco().getNombre());
    }
}