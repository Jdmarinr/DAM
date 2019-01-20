/*
Te pide tu nombre y lo muestra 5 veces.
 */
package tema04_javaejercicio22;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema04_JAVAEjercicio22 {
    static String nombre;
    public static void nombre() {
        System.out.println("Introduzca su nombre: ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.next();
    }

    public static void mostrar() {
        System.out.println("Se muestra 5 veces: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre);
        }
    }

    public static void main(String[] args) {
        nombre();
        mostrar();
    }
}
