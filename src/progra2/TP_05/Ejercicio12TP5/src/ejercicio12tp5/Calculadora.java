/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12tp5;

/**
 *
 * @author Martin
 */
// Dependencia de uso: no guarda Impuesto
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de " +
            impuesto.getContribuyente().getNombre() + ": $" + impuesto.getMonto());
    }
}