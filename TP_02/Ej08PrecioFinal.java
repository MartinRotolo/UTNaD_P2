
package TP_02;
import java.util.Scanner;

public class Ej08PrecioFinal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impPct = sc.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descPct = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impPct, descPct);
        System.out.println("El precio final del producto es: " + precioFinal);
        sc.close();
    }

    /**
     * @param precioBase precio base
     * @param impuestoPct porcentaje de impuesto (p.ej., 10 = 10%)
     * @param descuentoPct porcentaje de descuento (p.ej., 5 = 5%)
     * @return precio final
     */
    public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double impuesto = precioBase * (impuestoPct / 100.0);
        double descuento = precioBase * (descuentoPct / 100.0);
        return precioBase + impuesto - descuento;
    }
}
