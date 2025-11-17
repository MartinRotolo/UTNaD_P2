
package mainuniversidad;

/**
 *
 * @author Martin
 */
public class CursoU {

    private String codigo;
    private String nombre;
    private ProfesorU profesor;

    public CursoU(String codigo, String nombre) {
        if (codigo == null || codigo.isEmpty()) {
            codigo = "SIN_COD";
        }
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Sin nombre";
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ProfesorU getProfesor() {
        return profesor;
    }

    public void asignarProfesor(ProfesorU nuevo) {
        if (this.profesor == nuevo) {
            return;
        }

        // Quitar del profesor anterior (si existía)
        if (this.profesor != null) {
            this.profesor.removerCursoSiEsta(this);
        }

        // Asignar el nuevo
        this.profesor = nuevo;

        // Asegurar consistencia del otro lado
        if (nuevo != null) {
            nuevo.agregarCursoSiNoEsta(this);
        }
    }

    public void mostrarInfo() {
        String nomProf = (profesor == null) ? "(sin profesor)" : profesor.getNombre();
        System.out.println("Curso[" + codigo + "] " + nombre + " — Profesor: " + nomProf);
    }
}
