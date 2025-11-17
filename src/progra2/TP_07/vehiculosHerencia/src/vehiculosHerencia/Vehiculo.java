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
// Superclase 
public class Vehiculo {
    protected String marca; 
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehiculo: " + marca + " " + modelo);
    }
}