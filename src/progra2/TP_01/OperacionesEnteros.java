
package progra2;
import java.util.Scanner;

    public class OperacionesEnteros {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer entero: ");
        int a = sc.nextInt();

        System.out.print("Segundo entero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b != 0) {
            System.out.println("División: " + (a / b));  // división entera
        } else {
            System.out.println("División: error (divisor 0)");
        }
    }
}
