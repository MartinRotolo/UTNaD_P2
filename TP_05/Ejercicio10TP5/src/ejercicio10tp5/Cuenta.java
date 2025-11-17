/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10tp5;

/**
 *
 * @author Martin
 */
// Composición con ClaveSeguridad + bidireccional con Titular
public class Cuenta {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composición
    private Titular titular;      // bidireccional

    public Cuenta(String cbu, double saldo, String codigo, String ultimaMod) {
        this.cbu = cbu; this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaMod);
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    public Titular getTitular() { return titular; }
    public ClaveSeguridad getClave() { return clave; }
    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
}