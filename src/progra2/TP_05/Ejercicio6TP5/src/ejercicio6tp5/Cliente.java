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
public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre; this.telefono = telefono;
    }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
}