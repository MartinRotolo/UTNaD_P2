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
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero; this.capacidad = capacidad;
    }
    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
}