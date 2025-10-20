
package mainuniversidad;

/**
 *
 * @author Martin
 */
import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<ProfesorU> profesores;
    private List<CursoU> cursos;

    public Universidad(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Universidad";
        }
        this.nombre = nombre;
        this.profesores = new ArrayList<ProfesorU>();
        this.cursos = new ArrayList<CursoU>();
    }

    public void agregarProfesor(ProfesorU p) {
        if (p == null) {
            return;
        }
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i) == p) {
                return; // ya agregado
            }
        }
        profesores.add(p);
    }

    public void agregarCurso(CursoU c) {
        if (c == null) {
            return;
        }
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i) == c) {
                return; // ya agregado
            }
        }
        cursos.add(c);
    }

    public ProfesorU buscarProfesorPorId(String id) {
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getId().equals(id)) {
                return profesores.get(i);
            }
        }
        return null;
    }

    public CursoU buscarCursoPorCodigo(String cod) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equals(cod)) {
                return cursos.get(i);
            }
        }
        return null;
    }

    public void listarProfesores() {
        for (int i = 0; i < profesores.size(); i++) {
            profesores.get(i).mostrarInfo();
        }
    }

    public void listarCursos() {
        for (int i = 0; i < cursos.size(); i++) {
            cursos.get(i).mostrarInfo();
        }
    }

    /**
     * Asignación.
     */
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        CursoU c = buscarCursoPorCodigo(codigoCurso);
        ProfesorU p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) {
            return false;
        }
        c.asignarProfesor(p);
        return true;
    }

    /**
     * Elimina curso y limpia la relación si corresponde.
     */
    public boolean eliminarCurso(String codigo) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equals(codigo)) {
                CursoU c = cursos.get(i);
                if (c.getProfesor() != null) {
                    c.asignarProfesor(null);
                }
                cursos.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina profesor dejando sus cursos sin asignación.
     */
    public boolean eliminarProfesor(String id) {
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getId().equals(id)) {
                ProfesorU p = profesores.get(i);
                p.desasignarTodosLosCursos();
                profesores.remove(i);
                return true; 
            }
        }
        return false;
    }
}
