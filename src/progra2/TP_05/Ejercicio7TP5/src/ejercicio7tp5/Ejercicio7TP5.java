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
public class Ejercicio7TP5 {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "A12345");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Mustang", motor);
        Conductor conductor = new Conductor("Diego Gómez", "B-2025-MDQ");

        vehiculo.setConductor(conductor);

        System.out.println(conductor.getNombre() + " conduce " +
                vehiculo.getModelo() + " con motor " + vehiculo.getMotor().getTipo());
    }
}