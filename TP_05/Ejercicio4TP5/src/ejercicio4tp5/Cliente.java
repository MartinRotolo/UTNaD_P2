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
public class Cliente {
    private String nombre;
    private String dni;
    private Tarjeta tarjeta; // bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }
    public Tarjeta getTarjeta() { return tarjeta; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}