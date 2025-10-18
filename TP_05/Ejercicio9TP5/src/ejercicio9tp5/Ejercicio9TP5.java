/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9tp5;

/**
 *
 * @author Martin
 */
public class Ejercicio9TP5 {
    public static void main(String[] args) {
        Paciente pac = new Paciente("Carla Díaz", "IOMA");
        Profesional prof = new Profesional("Dr. Ramírez", "Clínica Médica");
        CitaMedica cita = new CitaMedica("18/10/2025", "10:30", pac, prof);

        System.out.println("Cita: " + cita.getFecha() + " " + cita.getHora() +
                " — Paciente: " + cita.getPaciente().getNombre() +
                " — Profesional: " + cita.getProfesional().getNombre());
    }
}