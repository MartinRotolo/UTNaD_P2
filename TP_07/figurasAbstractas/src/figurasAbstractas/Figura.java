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

public abstract class Figura { 
    protected String nombre;

    public Figura(String nombre) { 
        this.nombre = nombre;
    }

    public abstract double calcularArea(); 
}