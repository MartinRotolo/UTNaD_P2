
package TP_02;
import java.util.Scanner;

public class Ej05SumaParesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumaPares = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            n = sc.nextInt();
            if (n % 2 == 0) {
                sumaPares += n;
            }
        } while (n != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);
        sc.close();
    }
}
