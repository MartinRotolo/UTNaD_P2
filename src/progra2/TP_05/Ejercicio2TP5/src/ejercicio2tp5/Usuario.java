/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2tp5;

/**
 *
 * @author Martin
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }
    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    public Celular getCelular() { return celular; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}