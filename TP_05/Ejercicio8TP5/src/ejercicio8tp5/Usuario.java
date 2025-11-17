/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8tp5;

/**
 *
 * @author Martin
 */
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre; this.email = email;
    }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}