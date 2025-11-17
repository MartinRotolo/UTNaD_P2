/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;



import interfaces.Notificable;
import interfaces.Pagable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Notificable cliente; // El pedido se asocia a un cliente "Notificable"
    private String estado;

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Iniciado";
        notificarCliente("Pedido creado y en estado 'Iniciado'.");
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        notificarCliente("Producto '" + p.getNombre() + "' agregado al carrito.");
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal(); // Usa el método calcularTotal() de cada Producto
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCliente("El estado de su pedido cambió a: " + nuevoEstado);
    }
    
    // Método privado para notificar al cliente si existe
    private void notificarCliente(String mensaje) {
        if (this.cliente != null) {
            this.cliente.notificar(mensaje);
        }
    }
}