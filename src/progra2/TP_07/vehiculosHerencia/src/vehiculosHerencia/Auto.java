/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosHerencia;

/**
 *
 * @author Martin
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas; 

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override 
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo + " con " + cantidadPuertas + " puertas.");
    }
}