/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosPolimorfismo;

/**
 *
 * @author Martin
 */
public abstract class Empleado {
    protected String nombre;
    public Empleado(String nombre) { this.nombre = nombre; }
    public abstract double calcularSueldo(); // Contrato 
}