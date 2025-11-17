/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7tp5;

/**
 *
 * @author Martin
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre; this.licencia = licencia;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }
    public Vehiculo getVehiculo() { return vehiculo; }
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
}