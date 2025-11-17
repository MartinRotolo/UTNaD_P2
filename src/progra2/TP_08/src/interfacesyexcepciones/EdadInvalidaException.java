/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesyexcepciones;

/**
 * Excepción personalizada (checked) para validar rangos de edad.
 * Extiende de Exception, por lo que obliga a ser capturada.
 */
public class EdadInvalidaException extends Exception {
    
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}