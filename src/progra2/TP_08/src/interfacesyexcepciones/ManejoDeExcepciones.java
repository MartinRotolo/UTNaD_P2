/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesyexcepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoDeExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1: División Segura
        // ejercicio1_DivisionSegura(scanner); 

        // Ejercicio 2: Conversión de Cadena
        // ejercicio2_ConversionCadena(scanner); 

        // Ejercicio 3: Lectura de Archivo
        // ejercicio3_LecturaArchivo(scanner); 
        
        // Ejercicio 4: Excepción Personalizada
        // ejercicio4_ExcepcionPersonalizada(scanner); 

        // Ejercicio 5: Try-With-Resources
         ejercicio5_TryWithResources(); 

        scanner.close();
        System.out.println("Programa finalizado.");
    }

    /**
     * Ejercicio 1: Manejo de ArithmeticException
     */
    public static void ejercicio1_DivisionSegura(Scanner scanner) {
        System.out.println("\n--- Ejercicio 1: División Segura ---");
        try {
            System.out.print("Ingrese el dividendo: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el divisor: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar números enteros.");
        } finally {
            // El 'finally' se ejecuta siempre, haya o no excepción.
            System.out.println("Bloque 'finally' de división ejecutado.");
            scanner.nextLine(); // Limpiar buffer del scanner
        }
    }

    /**
     * Ejercicio 2: Manejo de NumberFormatException
     */
    public static void ejercicio2_ConversionCadena(Scanner scanner) {
        System.out.println("\n--- Ejercicio 2: Conversión de Cadena ---");
        System.out.print("Ingrese un texto (que intente ser un número): ");
        String texto = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: El texto '" + texto + "' no es un número entero válido.");
        }
    }

    /**
     * Ejercicio 3: Manejo de FileNotFoundException (Checked)
     */
    public static void ejercicio3_LecturaArchivo(Scanner scanner) {
        System.out.println("\n--- Ejercicio 3: Lectura de Archivo ---");
        System.out.print("Ingrese el nombre del archivo (ej. 'texto.txt'): ");
        String nombreArchivo = scanner.nextLine();
        
        try {
            FileReader fr = new FileReader(nombreArchivo);
            // Si llega aquí, el archivo existe.
            System.out.println("El archivo '" + nombreArchivo + "' existe y se puede leer.");
            fr.close(); // Cerramos el recurso
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
    
    /**
     * Ejercicio 4: Lanzamiento de Excepción Personalizada
     */
    public static void ejercicio4_ExcepcionPersonalizada(Scanner scanner) {
        System.out.println("\n--- Ejercicio 4: Excepción Personalizada ---");
        try {
            System.out.print("Ingrese una edad: ");
            int edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("La edad " + edad + " es válida.");
            
        } catch (EdadInvalidaException e) {
            System.err.println("Error de validación: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar un número.");
        } finally {
            scanner.nextLine(); // Limpiar buffer
        }
    }
    
    // Método helper para Ejercicio 4 que "lanza" (throws) la excepción
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }

    /**
     * Ejercicio 5: Uso de try-with-resources
     */
    public static void ejercicio5_TryWithResources() {
        System.out.println("\n--- Ejercicio 5: Try-With-Resources ---");
        
        // (Crea un archivo 'poema.txt' en la raíz de tu proyecto para probar)
        String nombreArchivo = "poema.txt";

        // El 'try-with-resources' cierra automáticamente el BufferedReader (br)
        // al finalizar el bloque, tanto si hay éxito como si hay excepción.
        // No es necesario un bloque 'finally' para cerrarlo.
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Leyendo el archivo '" + nombreArchivo + "':\n");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: No se encontró el archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}