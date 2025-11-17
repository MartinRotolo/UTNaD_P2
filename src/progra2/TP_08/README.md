# Trabajo Práctico N° 8: Interfaces y Excepciones

Este proyecto contiene la resolución del TP8 de la materia Programación II de la UTN.

**Alumno:** [Rotolo Martin]

---

## Parte 1: E-commerce (Interfaces)

La lógica de esta parte se encuentra en los paquetes:
* `interfaces/`
* `modelos/`
* `pagos/`

### Cómo ejecutar:

Simplemente ejecute el archivo `MainECommerce.java`. El programa correrá automáticamente y mostrará en consola:
1.  Las notificaciones al cliente.
2.  El cálculo del total del pedido.
3.  El procesamiento de pago con dos métodos distintos (uno con descuento).

---

## Parte 2: Manejo de Excepciones

La lógica de esta parte se encuentra en los archivos:
* `ManejoDeExcepciones.java`
* `EdadInvalidaException.java`

### Cómo ejecutar:

1.  Abra el archivo `ManejoDeExcepciones.java`.
2.  Dentro del método `main`, descomente la línea del ejercicio que desea probar (ej. `ejercicio1_DivisionSegura(scanner);`).
3.  Ejecute el archivo `ManejoDeExcepciones.java`.

**Nota para Ejercicio 5:** Para probar el `try-with-resources`, es necesario tener un archivo llamado `poema.txt` en la raíz del proyecto.