/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14tp5;

/**
 *
 * @author Martin
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre; this.duracionMin = duracionMin;
    }
    public String getNombre() { return nombre; }
    public int getDuracionMin() { return duracionMin; }
}