/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2tp5;

/**
 *
 * @author Martin
 */
// Agregación: recibe Bateria desde afuera
public class Celular {
    private String imei, marca, modelo;
    private Bateria bateria;
    private Usuario usuario; // bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei; this.marca = marca; this.modelo = modelo; this.bateria = bateria;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    public Usuario getUsuario() { return usuario; }
    public Bateria getBateria() { return bateria; }
    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}