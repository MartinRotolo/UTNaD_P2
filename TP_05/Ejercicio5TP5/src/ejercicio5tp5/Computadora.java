/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5tp5;

/**
 *
 * @author Martin
 */
// Composición: crea su PlacaMadre internamente
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // composición
    private Propietario propietario; // bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPM, String chipsetPM) {
        this.marca = marca; this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPM, chipsetPM);
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    public Propietario getPropietario() { return propietario; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
}