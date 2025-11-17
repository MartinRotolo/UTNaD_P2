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
public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo; this.chipset = chipset;
    }
    public String getModelo() { return modelo; }
    public String getChipset() { return chipset; }
}