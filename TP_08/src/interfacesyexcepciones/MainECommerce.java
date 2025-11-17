/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesyexcepciones;

import modelos.Cliente;
import modelos.Pedido;
import modelos.Producto;
import interfaces.Pago;
import pagos.PayPal;
import pagos.TarjetaCredito;

public class MainECommerce {
    public static void main(String[] args) {
        // 1. Crear cliente (que es Notificable)
        Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@email.com");

        // 2. Crear pedido (se auto-notifica al crearse)
        Pedido pedido1 = new Pedido(cliente1);

        // 3. Agregar productos (notifica cada vez)
        pedido1.agregarProducto(new Producto("Mouse Gamer", 8500.0));
        pedido1.agregarProducto(new Producto("Teclado Mecánico", 14200.0));
        
        // 4. Cambiar estado (notifica)
        pedido1.setEstado("Preparando envío");

        // 5. Calcular total (usando Pagable)
        double totalPedido = pedido1.calcularTotal();
        System.out.println("\n>> TOTAL DEL PEDIDO: $" + totalPedido);

        // 6. Procesar pago (Punto 4 del TP)
        
        // Opción A: Pagar con Tarjeta (sin descuento)
        Pago medioDePagoTC = new TarjetaCredito("1234-5678-XXXX-XXXX");
        medioDePagoTC.procesarPago(totalPedido);

        // Opción B: Pagar con PayPal (con descuento)
        PayPal medioDePagoPP = new PayPal("juan.perez@email.com");
        medioDePagoPP.procesarPago(totalPedido);
        
        // 7. Cambiar estado final
        pedido1.setEstado("Pagado y Enviado");
    }
}