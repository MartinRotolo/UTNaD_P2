package mainstock;

/**
 *
 * @author Martin
 */
import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<Producto>();
    }

    public boolean agregarProducto(Producto p) {
        if (p == null) {
            return false;
        }
        if (buscarProductoPorId(p.getId()) != null) {
            System.out.println("Aviso: ya existe un producto con ID " + p.getId());
            return false;
        }
        productos.add(p);
        return true;
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("(Inventario vacío)");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId().equals(id)) {
                productos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p == null) {
            return false;
        }
        p.actualizarStock(nuevaCantidad);
        return true;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto cat) {
        List<Producto> resultado = new ArrayList<Producto>();
        for (Producto p : productos) {
            if (p.getCategoria() == cat) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto max = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            if (productos.get(i).getCantidad() > max.getCantidad()) {
                max = productos.get(i);
            }
        }
        return max;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> resultado = new ArrayList<Producto>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c);
        }
    }

    // Vista de solo lectura simple (copia)
    public List<Producto> verProductos() {
        List<Producto> copia = new ArrayList<Producto>();
        copia.addAll(productos);
        return copia;
    }
}
