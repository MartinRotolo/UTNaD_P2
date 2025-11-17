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
public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre; this.obraSocial = obraSocial;
    }
    public String getNombre() { return nombre; }
    public String getObraSocial() { return obraSocial; }
}