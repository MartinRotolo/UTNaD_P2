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
public class Ejercicio12TP5 {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Luciano Torres", "20-40352878-3");
        Impuesto imp = new Impuesto(25000, c);
        Calculadora calc = new Calculadora();

        calc.calcular(imp);
    }
}