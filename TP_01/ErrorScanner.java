
package progra2;
    import java.util.Scanner;

//String nombre = scanner.nextInt(); // ERROR
//Error: nextInt() devuelve int, no String. 
//Solución: leer texto con nextLine() o next().

public class ErrorScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // corregido
        System.out.println("Hola, " + nombre);
    }
}


