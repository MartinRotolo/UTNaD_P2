/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * Define un contrato para un método de pago.
 */
public interface Pago {
    boolean procesarPago(double monto);
}