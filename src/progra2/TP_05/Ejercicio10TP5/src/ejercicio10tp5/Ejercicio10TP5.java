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
public class Ejercicio10TP5 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("0011223344556677889900", 150000, "XYZ789", "2025-08-01");
        Titular titular = new Titular("Juan García", "40123456");

        cuenta.setTitular(titular);

        System.out.println("Cuenta de " + titular.getNombre() +
                " — CBU: " + cuenta.getCbu() +
                " — Clave: " + cuenta.getClave().getCodigo());
    }
}