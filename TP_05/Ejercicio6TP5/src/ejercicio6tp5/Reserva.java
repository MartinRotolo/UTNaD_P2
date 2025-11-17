/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6tp5;

/**
 *
 * @author Martin
 */
// Asociación → Cliente ; Agregación → Mesa
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // →
    private Mesa mesa;       // agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha; this.hora = hora; this.cliente = cliente; this.mesa = mesa;
    }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}