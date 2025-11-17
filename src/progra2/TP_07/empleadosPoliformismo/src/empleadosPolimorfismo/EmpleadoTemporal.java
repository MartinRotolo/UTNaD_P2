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
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    public EmpleadoTemporal(String nombre, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public double calcularSueldo() { return horasTrabajadas * 15; } // Lógica temporal
}