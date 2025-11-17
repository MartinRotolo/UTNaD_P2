
package TP_03;

public class Gallina {
    private String idGallina;
    private int   edad;
    private int   huevosPuestos;

    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        setEdad(edadInicial);
        this.huevosPuestos = 0;
    }

    public void ponerHuevo()   { this.huevosPuestos++; }
    public void envejecer()    { setEdad(this.edad + 1); }

    public void mostrarEstado() {
        System.out.printf("Gallina %s | Edad: %d | Huevos puestos: %d%n",
                idGallina, edad, huevosPuestos);
    }

    // Getters/Setters
    public String getIdGallina() { return idGallina; }
    public int getEdad()         { return edad; }
    public int getHuevosPuestos(){ return huevosPuestos; }

    public void setEdad(int edad) {
        if (edad < 0) edad = 0;
        this.edad = edad;
    }
}
