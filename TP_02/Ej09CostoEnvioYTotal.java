
package TP_02;

import java.util.Scanner;


public class Ej09CostoEnvioYTotal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) {
            System.out.println("Zona inválida.");
        } else {
            double total = calcularTotalCompra(precio, costoEnvio);
            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
        }
        sc.close();
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5.0 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10.0 * peso;
        } else {
            return -1.0; // indicador de error
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
