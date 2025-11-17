/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * Extiende la interfaz Pago, añadiendo la capacidad de aplicar descuentos.
 */
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}