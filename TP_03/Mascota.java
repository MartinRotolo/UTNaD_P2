
package TP_03;


public class Mascota {
     private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.printf("Mascota: %s | Especie: %s | Edad: %d%n", nombre, especie, edad);
    }

    public void cumplirAnios() { setEdad(this.edad + 1); }

    // Getters/Setters
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad < 0) edad = 0;
        this.edad = edad;
    }
}
