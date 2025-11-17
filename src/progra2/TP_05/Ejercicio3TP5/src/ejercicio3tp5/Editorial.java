/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3tp5;

/**
 *
 * @author Martin
 */
public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre; this.direccion = direccion;
    }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
}