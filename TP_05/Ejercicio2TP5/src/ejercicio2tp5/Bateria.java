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

public class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo; this.capacidad = capacidad;
    }
    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }
}