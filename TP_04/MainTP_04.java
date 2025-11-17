
package TP_04;


public class MainTP_04 {
      
     public static void main(String[] args) {
  
        System.out.println("=== TP4 — POO II: Empleado ===");

        // 1) Instanciación con constructor parcial (nombre + puesto)
        Empleado e1 = new Empleado("Ana García", "Desarrolladora");
        Empleado e2 = new Empleado("Pedro Díaz", "QA Analyst");

        // 2) Instanciación con constructor completo (todos los atributos)
        Empleado e3 = new Empleado(100, "María Jofre", "Team Lead", 250000.0);

        // 3) Mostrar info (toString)
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // 4) Actualizar salario (sobrecarga)
        e1.actualizarSalario(10.0);   // +10%
 
        e2.actualizarSalario(20000);  // +$20.000
    
        e3.actualizarSalario(-5.0);

        System.out.println("\n--- Después de actualizar salarios ---");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // 5) Mostrar total de empleados (método estático)
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
