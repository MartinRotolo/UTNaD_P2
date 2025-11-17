/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * Define un contrato para cualquier objeto que pueda recibir notificaciones.
 */
public interface Notificable {
    void notificar(String mensaje);
}