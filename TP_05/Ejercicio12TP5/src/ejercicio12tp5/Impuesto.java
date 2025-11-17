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
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // asociación →

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto; this.contribuyente = contribuyente;
    }
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
}