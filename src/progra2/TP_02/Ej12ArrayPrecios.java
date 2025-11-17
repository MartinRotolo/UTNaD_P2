
package TP_02;

public class Ej12ArrayPrecios {
      public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        imprimirPrecios(precios);

        // Modificar el precio del índice 2 (tercer elemento) a 129.99
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirPrecios(precios);
    }

    public static void imprimirPrecios(double[] arr) {
        for (double p : arr) {
            System.out.println("Precio: $" + p);
        }
    }
}
