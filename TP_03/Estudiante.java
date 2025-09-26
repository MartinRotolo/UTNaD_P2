
package TP_03;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion; 

 
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion); 
    }


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

   
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }

    public void setCurso(String curso) { this.curso = curso; }

    public void setCalificacion(double calificacion) {
        
        if (calificacion < 0) calificacion = 0;
        if (calificacion > 10) calificacion = 10;
        this.calificacion = calificacion;
    }
}

