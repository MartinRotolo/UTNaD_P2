/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4tp5;

/**
 *
 * @author Martin
 */
// Agregación con Banco + asociación bidireccional con Cliente
public class Tarjeta {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;      // agregación
    private Cliente cliente;  // bidireccional

    public Tarjeta(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero; this.fechaVencimiento = fechaVencimiento; this.banco = banco;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
}