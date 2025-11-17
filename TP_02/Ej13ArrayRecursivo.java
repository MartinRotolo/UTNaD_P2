
package TP_02;

public class Ej13ArrayRecursivo {
    
     public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificar el precio del índice 2 a 129.99
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }

    public static void imprimirRecursivo(double[] arr, int i) {
        if (i == arr.length) {
            return; // caso base
        }
        System.out.println("Precio: $" + arr[i]);
        imprimirRecursivo(arr, i + 1); // llamada recursiva
    }
    
}
