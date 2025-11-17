/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasAbstractas;

/**
 *
 * @author Martin
 */
public class Main {
    public static void main(String[] args) {
        // Upcasting automático de Circulo y Rectangulo a Figura 
        Figura[] misFiguras = {
            new Circulo("C1", 10.0),
            new Rectangulo("R1", 5.0, 8.0)
        };


        for (Figura fig : misFiguras) {
            // Se llama al método sobrescrito correspondiente 
            System.out.println("Area de " + fig.nombre + ": " + fig.calcularArea());
        }
    }
}