
package TP_04;


public class Empleado {
    
    // Encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Miembros de clase (static)
    private static int totalEmpleados = 0;   
    private static int nextId = 1;          

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = Math.max(0, salario); 
        totalEmpleados++;                   
    }

    // Constructor parcial 
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;      
        this.nombre = nombre;     
        this.puesto = puesto;
        this.salario = 100000.0;   
        totalEmpleados++;          
    }

    // Métodos sobrecargados: actualizarSalario

    /** Aumenta por porcentaje */
    public void actualizarSalario(double porcentaje) {
        double factor = 1 + (porcentaje / 100.0);
        this.salario = Math.max(0, this.salario * factor);
    }

    /** Aumenta por monto fijo */
    public void actualizarSalario(int montoFijo) {
   
        this.salario = Math.max(0, this.salario + montoFijo);
    }

    // Representación legible 
@Override
public String toString() {
    return String.format("Empleado {id=%d, nombre='%s', puesto='%s', salario=%.2f}", 
                          id, nombre, puesto, salario);
}


    //  Método estático requerido
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    //  Getters/Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) {
        this.nombre = (nombre == null) ? "" : nombre.trim();
    }
    public void setPuesto(String puesto) {
        this.puesto = (puesto == null) ? "" : puesto.trim();
    }
    public void setSalario(double salario) {
        this.salario = Math.max(0, salario);
    }

 
}
