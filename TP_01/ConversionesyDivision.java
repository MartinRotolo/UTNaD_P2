
package progra2;

import java.util.Scanner;

public class ConversionesyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) enteros
        System.out.print("a (int): ");
        int a = sc.nextInt();
        System.out.print("b (int): ");
        int b = sc.nextInt();
        System.out.println("a / b (int): " + (a / b)); // trunca

        // b) dobles
        double da = a;
        double db = b; 
        System.out.println("a / b (double): " + (da / db)); // con decimales
    }
}
