
package mainuniversidad;

/**
 *
 * @author Martin
 */
import java.util.ArrayList;
import java.util.List;

public class ProfesorU {

    private String id;
    private String nombre;
    private String especialidad;
    private List<CursoU> cursos; 

    public ProfesorU(String id, String nombre, String especialidad) {
        if (id == null || id.isEmpty()) {
            id = "SIN_PROF";
        }
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Docente";
        }
        if (especialidad == null || especialidad.isEmpty()) {
            especialidad = "N/D";
        }
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<CursoU>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<CursoU> getCursosCopia() {
        List<CursoU> copia = new ArrayList<CursoU>();
        for (CursoU c : cursos) {
            copia.add(c);
        }
        return copia;
    }

  
    public void agregarCursoSiNoEsta(CursoU c) {
        if (c == null) {
            return;
        }
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i) == c) {
                return; 
            }
        }
        cursos.add(c);
        // Garantizar consistencia del lado Curso si faltara
        if (c.getProfesor() != this) {
            c.asignarProfesor(this);
        }
    }


    public void removerCursoSiEsta(CursoU c) {
        if (c == null) {
            return;
        }
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i) == c) {
                cursos.remove(i);
                // Si el curso todavía me apunta, lo dejamos sin profesor
                if (c.getProfesor() == this) {
                    c.asignarProfesor(null);
                }
                return; 
            }
        }
    }

    /**
     * Deja todos sus cursos sin profesor
     */
    public void desasignarTodosLosCursos() {
        // Trabajar sobre una copia para evitar problemas al remover
        List<CursoU> copia = getCursosCopia();
        for (int i = 0; i < copia.size(); i++) {
            CursoU c = copia.get(i);
            c.asignarProfesor(null);  // “dejar profesor = null”
        }
    }

    public void listarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        for (int i = 0; i < cursos.size(); i++) {
            CursoU c = cursos.get(i);
            System.out.println("- " + c.getCodigo() + " " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor[" + id + "] " + nombre + " — " + especialidad
                + " — cursos=" + cursos.size());
    }
}
