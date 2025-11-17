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
public class Ejercicio8TP5 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Sofía", "sofia@mail.com");
        Documento doc = new Documento("Contrato", "Contenido legal...", "ABCD1234", "2025-10-15", usuario);

        System.out.println(doc.getTitulo() + " firmado por " +
                doc.getFirma().getUsuario().getNombre() +
                " el " + doc.getFirma().getFecha());
    }
}