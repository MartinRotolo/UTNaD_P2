
package TP_03;


public class Estudiante {
     // Estado (atributos) — privados por encapsulamiento
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion; // 0..10 recomendado

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion); // valida rango
    }

    // Comportamiento (métodos)
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                " | Curso: " + curso +
                " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        setCalificacion(this.calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        setCalificacion(this.calificacion - puntos);
    }

    // Getters/Setters (acceso controlado)
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }

    public void setCurso(String curso) { this.curso = curso; }

    public void setCalificacion(double calificacion) {
        // Validación simple de negocio (ej.: 0..10)
        if (calificacion < 0) calificacion = 0;
        if (calificacion > 10) calificacion = 10;
        this.calificacion = calificacion;
    }
}

