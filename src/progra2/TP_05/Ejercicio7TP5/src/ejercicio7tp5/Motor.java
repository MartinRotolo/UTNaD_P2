/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7tp5;

/**
 *
 * @author Martin
 */
public class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo; this.numeroSerie = numeroSerie;
    }
    public String getTipo() { return tipo; }
    public String getNumeroSerie() { return numeroSerie; }
}