/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14tp5;

/**
 *
 * @author Martin
 */
public class Render {
    private String formato;
    private Proyecto proyecto; // asociación →

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato; this.proyecto = proyecto;
    }
    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
}