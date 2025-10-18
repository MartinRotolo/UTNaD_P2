/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4tp5;

/**
 *
 * @author Martin
 */
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre; this.cuit = cuit;
    }
    public String getNombre() { return nombre; }
    public String getCuit() { return cuit; }
}