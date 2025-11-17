package mainbiblioteca;

/**
 *
 * @author Martin
 */
public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        if (id == null || id.isEmpty()) {
            id = "SIN_ID";
        }
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Desconocido";
        }
        if (nacionalidad == null || nacionalidad.isEmpty()) {
            nacionalidad = "N/D";
        }
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("Autor[" + id + "] " + nombre + " (" + nacionalidad + ")");
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
