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
// Agregación con Motor + asociación bidireccional con Conductor
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // agregación
    private Conductor conductor; // bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente; this.modelo = modelo; this.motor = motor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    public Conductor getConductor() { return conductor; }
    public Motor getMotor() { return motor; }
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
}