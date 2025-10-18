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
// Asociación unidireccional a Paciente y a Profesional
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;         // →
    private Profesional profesional;   // →

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha; this.hora = hora; this.paciente = paciente; this.profesional = profesional;
    }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
}