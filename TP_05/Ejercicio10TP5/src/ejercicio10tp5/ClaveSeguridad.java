/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10tp5;

/**
 *
 * @author Martin
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo; this.ultimaModificacion = ultimaModificacion;
    }
    public String getCodigo() { return codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }
}