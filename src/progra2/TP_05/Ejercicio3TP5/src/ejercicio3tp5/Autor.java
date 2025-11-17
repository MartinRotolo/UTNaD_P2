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
public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre; this.nacionalidad = nacionalidad;
    }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
}