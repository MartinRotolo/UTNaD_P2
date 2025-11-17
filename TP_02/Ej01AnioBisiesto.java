
package TP_02;
import java.util.Scanner;


public class Ej01AnioBisiesto {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        sc.close();
    }
    
}
