/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13tp5;

/**
 *
 * @author Martin
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // asociación →

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor; this.usuario = usuario;
    }
    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }
}