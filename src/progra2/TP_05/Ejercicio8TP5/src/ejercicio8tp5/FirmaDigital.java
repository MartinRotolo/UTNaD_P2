/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8tp5;

/**
 *
 * @author Martin
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // agregación

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash; this.fecha = fecha; this.usuario = usuario;
    }
    public String getCodigoHash() { return codigoHash; }
    public String getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
}