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
// Dependencia de creación: instancia Render dentro del método
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportado " + render.getFormato() +
                " del proyecto " + render.getProyecto().getNombre());
    }
}