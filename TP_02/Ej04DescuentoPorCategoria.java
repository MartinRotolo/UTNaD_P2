
package TP_02;
import java.util.Scanner;

public class Ej04DescuentoPorCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.next();

        double porcentaje;
        switch (cat.toUpperCase()) {
            case "A": porcentaje = 10; break;
            case "B": porcentaje = 15; break;
            case "C": porcentaje = 20; break;
            default:
                System.out.println("Categoría inválida.");
                sc.close();
                return;
        }
        double descuento = precio * (porcentaje / 100.0);
        double finalConDesc = precio - descuento;

        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Precio final: " + finalConDesc);
        sc.close();
    }
}
