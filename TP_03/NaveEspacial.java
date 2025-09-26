
package TP_03;


public class NaveEspacial {
     private String nombre;
    private double combustible;
    private double capacidadMaxima;
    private boolean enVuelo;

    public NaveEspacial(String nombre, double combustibleInicial, double capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = Math.max(0, capacidadMaxima);
        if (combustibleInicial < 0) combustibleInicial = 0;
        this.combustible = Math.min(combustibleInicial, this.capacidadMaxima);
        this.enVuelo = false;
    }

    public void despegar() {
        if (enVuelo) { System.out.println(nombre + ": ya está en vuelo."); return; }
        if (combustible <= 0) { System.out.println(nombre + ": sin combustible para despegar."); return; }
        enVuelo = true;
        System.out.println(nombre + ": despegó correctamente.");
    }

    // Modelo simple: consumo 1:1 con la distancia
    public void avanzar(double distancia) {
        if (distancia <= 0) { System.out.println(nombre + ": distancia inválida."); return; }
        if (!enVuelo) { System.out.println(nombre + ": no puede avanzar sin despegar."); return; }
        double consumo = distancia;
        if (combustible < consumo) {
            System.out.println(nombre + ": combustible insuficiente para " + distancia + " (disp: " + combustible + ").");
            return;
        }
        combustible -= consumo;
        System.out.println(nombre + ": avanzó " + distancia + ". Combustible restante: " + combustible);
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) { System.out.println(nombre + ": cantidad a recargar inválida."); return; }
        combustible = Math.min(capacidadMaxima, combustible + cantidad);
        System.out.println(nombre + ": nivel de combustible: " + combustible + "/" + capacidadMaxima);
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + capacidadMaxima + " | En vuelo: " + enVuelo);
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getCombustible() { return combustible; }
    public double getCapacidadMaxima() { return capacidadMaxima; }
    public boolean isEnVuelo() { return enVuelo; }
}

