/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5tp5;

/**
 *
 * @author Martin
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    public Computadora getComputadora() { return computadora; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}