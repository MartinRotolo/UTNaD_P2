/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos;

import interfaces.PagoConDescuento;

// PayPal implementa la interfaz con descuento
public class PayPal implements PagoConDescuento {
    private String emailUsuario;
    private final double TASA_DESCUENTO = 0.10; // 10% de descuento por usar PayPal

    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - TASA_DESCUENTO);
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        
        System.out.println("\nProcesando pago con PayPal para: " + emailUsuario);
        System.out.println("Monto original: $" + monto);
        System.out.println("Monto con 10% descuento: $" + montoConDescuento);
        // Lógica de conexión con PayPal...
        System.out.println("¡Pago con PayPal Aprobado!");
        return true;
    }
}