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
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 3000));
        empleados.add(new EmpleadoTemporal("Luis", 80));

        System.out.println("Calculo polimorfico de sueldos:");
        for (Empleado emp : empleados) {
            // Llamada polimórfica 
            System.out.println(emp.nombre + " gana: " + emp.calcularSueldo());

            String tipo = (emp instanceof EmpleadoPlanta) ? "Es empleado de planta." : "Es empleado temporal.";
            System.out.println(" -> " + tipo);

//            if (emp instanceof EmpleadoPlanta) { 
//                System.out.println(" -> Es empleado de planta.");
//            } else if (emp instanceof EmpleadoTemporal) {
//                System.out.println(" -> Es empleado temporal.");
//            }
        }
    }
}
