package mainstock;

/**
 *
 * @author Martin
 */
import java.util.List;

public class MainStock {

    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1) Alta de 5 productos
        inv.agregarProducto(new Producto("P01", "Harina 000", 850.0, 20, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P02", "Camiseta algodón", 5200.0, 15, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P03", "Smartwatch X", 29999.0, 5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P04", "Silla madera", 18990.0, 12, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P05", "Yerba 1kg", 2800.0, 35, CategoriaProducto.ALIMENTOS));

        // 2) Listar
        System.out.println("== TODOS LOS PRODUCTOS ==");
        inv.listarProductos();

        // 3) Buscar por ID
        System.out.println("\n== BUSCAR P03 ==");
        Producto buscado = inv.buscarProductoPorId("P03");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 4) Filtrar categoría
        System.out.println("\n== ALIMENTOS ==");
        List<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) {
            p.mostrarInfo();
        }

        // 5) Eliminar
        System.out.println("\n== ELIMINAR P02 ==");
        inv.eliminarProducto("P02");
        inv.listarProductos();

        // 6) Actualizar stock
        System.out.println("\n== ACTUALIZAR STOCK P05 -> 50 ==");
        inv.actualizarStock("P05", 50);
        Producto p05 = inv.buscarProductoPorId("P05");
        if (p05 != null) {
            p05.mostrarInfo();
        }

        // 7) Total stock
        System.out.println("\n== TOTAL DE UNIDADES ==");
        System.out.println(inv.obtenerTotalStock());

        // 8) Mayor stock
        System.out.println("\n== MAYOR STOCK ==");
        Producto max = inv.obtenerProductoConMayorStock();
        if (max != null) {
            max.mostrarInfo();
        }

        // 9) Rango de precio
        System.out.println("\n== PRECIOS 1000..3000 ==");
        List<Producto> rango = inv.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : rango) {
            p.mostrarInfo();
        }

        // 10) Categorías
        System.out.println("\n== CATEGORÍAS DISPONIBLES ==");
        inv.mostrarCategoriasDisponibles();
    }
}
