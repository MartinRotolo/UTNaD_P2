/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12tp5;

/**
 *
 * @author Martin
 */
public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre; this.cuil = cuil;
    }
    public String getNombre() { return nombre; }
    public String getCuil() { return cuil; }
}