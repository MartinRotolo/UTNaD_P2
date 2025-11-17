/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos;



import interfaces.Pago;

// Esta clase solo implementa el pago simple, sin descuentos
public class TarjetaCredito implements Pago {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("\nProcesando pago de $" + monto + " con Tarjeta de Crédito " + numeroTarjeta);
        // Aquí iría la lógica de conexión con el banco...
        System.out.println("¡Pago con Tarjeta Aprobado!");
        return true;
    }
}