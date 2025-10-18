/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1tp5;

/**
 *
 * @author Martin
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // 1:1 bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    public Pasaporte getPasaporte() { return pasaporte; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}