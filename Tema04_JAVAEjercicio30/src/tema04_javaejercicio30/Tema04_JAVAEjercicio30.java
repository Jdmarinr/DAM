/*
Ejercicio 30: Contiene un método que calcula la potencia de un número (a) elevado a un número (b) que 
se le pasan como parámetros. Controla la excepción de que el número 0 elevado a un número negativo es infinito.
 */
package tema04_javaejercicio30;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema04_JAVAEjercicio30 {

    static Scanner scr = new Scanner(System.in);
    static int a;
    static int b;
    static double pot;

    public static void potencia() {
        System.out.println("Introduzca un número: ");
        a = scr.nextInt();
        System.out.println("Introduzca el número al que quiere elevarlo: ");
        b = scr.nextInt();

        if (a == 0 && b < 0) {
            System.out.println("El número cero elevado a un número negativo es infinito.");
        }else{
            System.out.println("La potencia es: ");
            pot = Math.pow(a, b);
            System.out.println(pot);
        }
    }

    public static void main(String[] args) {
        potencia();
    }

}
