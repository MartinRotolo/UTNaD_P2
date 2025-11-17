
package TP_02;
import java.util.Scanner;

public class Ej06ContarSignos {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int x = sc.nextInt();
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else ceros++;
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + ceros);
        sc.close();
    }
}
