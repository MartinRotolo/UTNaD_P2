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
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }
    @Override
    public double calcularSueldo() { return sueldoBase + 500; } // Lógica de planta
}