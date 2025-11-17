/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;



import interfaces.Notificable;

public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        // Simula el envío de una notificación (ej. por email)
        System.out.println("=====================================================");
        System.out.println("NOTIFICACIÓN ENVIADA A: " + this.email);
        System.out.println("Cliente: " + this.nombre);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("=====================================================");
    }
}