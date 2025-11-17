package mainstock;

/**
 *
 * @author Martin
 */
public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        // Validaciones simples 
        if (id == null || id.isEmpty()) {
            System.out.println("Aviso: ID inválido, se asigna 'SIN_ID'.");
            id = "SIN_ID";
        }
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Aviso: nombre inválido, se asigna 'Desconocido'.");
            nombre = "Desconocido";
        }
        if (categoria == null) {
            System.out.println("Aviso: categoría inválida, se asigna ALIMENTOS por defecto.");
            categoria = CategoriaProducto.ALIMENTOS;
        }
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Actualizar stock del producto
    public void actualizarStock(int nuevaCantidad) {
        if (nuevaCantidad >= 0) {
            this.cantidad = nuevaCantidad;
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    // Getters / Setters básicos
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(CategoriaProducto categoria) {
        if (categoria != null) {
            this.categoria = categoria;
        }
    }

    // Pedido por consigna
    public void mostrarInfo() {
        System.out.printf("ID: %s | %s | $%.2f | stock=%d | cat=%s%n",
                id, nombre, precio, cantidad, categoria.getDescripcion());
    }

    @Override
    public String toString() {
        return "Producto{id='" + id + "', nombre='" + nombre
                + "', precio=" + precio + ", cantidad=" + cantidad
                + ", categoria=" + categoria + "}";
    }
}
