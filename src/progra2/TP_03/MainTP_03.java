
package TP_03;


public class MainTP_03 {

    public static void main(String[] args) {
        // ===== 1) Estudiante =====
        System.out.println("=== 1) Registro de Estudiantes ===");
        Estudiante e = new Estudiante("Ana", "García", "Prog II", 7.5);
        e.mostrarInfo();           
        e.subirCalificacion(2.0);  
        e.mostrarInfo();
        e.bajarCalificacion(1.0); 
        e.mostrarInfo();

        // ===== 2) Mascota =====
        System.out.println("\n=== 2) Registro de Mascotas ===");
        Mascota m = new Mascota("Luna", "Perro", 3);
        m.mostrarInfo();   
        m.cumplirAnios();   
        m.mostrarInfo();  

        // ===== 3) Libro (encapsulamiento + validación) =====
        System.out.println("\n=== 3) Clase Libro (Encapsulamiento) ===");
        Libro l = new Libro("El Principito", "A. de Saint-Exupéry", 1943);
        l.mostrarInfo();
        l.setAnioPublicacion(-10); 
        l.setAnioPublicacion(1950); 
        l.mostrarInfo();           

        // ===== 4) Granja Digital (Gallinas) =====
        System.out.println("\n=== 4) Gestión de Gallinas ===");
        Gallina g1 = new Gallina("G-001", 1);
        Gallina g2 = new Gallina("G-002", 2);
        g1.envejecer(); g1.ponerHuevo(); g1.ponerHuevo();
        g2.envejecer(); g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        // ===== 5) Nave Espacial =====
        System.out.println("\n=== 5) Simulación de Nave Espacial ===");
        NaveEspacial nave = new NaveEspacial("Orión", 50, 100);
        nave.mostrarEstado();
        nave.avanzar(10);         
        nave.despegar();       
        nave.avanzar(60);        
        nave.recargarCombustible(30);
        nave.avanzar(60);         
        nave.mostrarEstado();     
    }
}


