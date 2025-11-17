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
// Dependencia de creación: crea y usa el QR, no lo persiste
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado: " + qr.getValor() +
                " para " + qr.getUsuario().getNombre());
    }
}