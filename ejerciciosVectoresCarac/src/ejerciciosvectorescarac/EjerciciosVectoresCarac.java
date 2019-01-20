/*
 * Ejercicio 1: Crear un vector de cararcteres de 10 elementos, cual es el valor del elemento 5.
 * 2 Generar un vector aleatorio de caracteres de 10 elementos.
 * 3 Crear un vector de caracteres de 10 elementos que se introducen por teclado.
 */
package ejerciciosvectorescarac;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class EjerciciosVectoresCarac {
    static Scanner scr = new Scanner (System.in);
    static char caract2[] = new char[10];
    static char caract3[] = new char[10];

    public static void ejercicio1() {

        char caract[] = {'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e'};

        System.out.println(caract[4]);
    }

    public static void ejercicio2() {

        for (int i = 0; i < 10; i++) {
            caract2[i] = (char) (Math.random() * 26 + 97);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(caract2[i]);
        }
    }
    
    public static void ejercicio3(){
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Introduzca un carácter: ");
            caract3[i] = scr.next().charAt(0);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(caract3[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nEjercicio 1: ");
        ejercicio1();
        System.out.println("\nEjercicio 2: ");
        ejercicio2();
        System.out.println("\nEjercicio 3: ");
        ejercicio3();
    }

}
