/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9tp5;

/**
 *
 * @author Martin
 */
public class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre; this.especialidad = especialidad;
    }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
}