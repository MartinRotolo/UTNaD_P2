/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10tp5;

/**
 *
 * @author Martin
 */
public class Titular {
    private String nombre;
    private String dni;
    private Cuenta cuenta; // bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }
    public Cuenta getCuenta() { return cuenta; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}