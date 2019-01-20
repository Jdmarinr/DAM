/*
Ejercicio 3: Cifrado de datos: dado un número de cuatro dígitos se reemplazará cada dígito por (dígito +7)
 módulo 10. A continuación se intercambiará el primer digito por el tercero y el segundo por el cuarto,
y ese será el número cifrado. Construir un programa que ofrece al usuario la posibilidad de cifrar o descifrar 
un número.
 */
package prog_ut4_ejercicios3;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT4_EJERCICIOS3 {

    public static Scanner scr = new Scanner(System.in);
    public static int num = -1;
    public static int aux, aux2;
    public static int[] a = new int[4];

    public static void decision() {
        System.out.println("Inserte 1 para cifra, y 2 para descifrar.");
        aux2 = scr.nextInt();
        while (aux2 != 1 && aux2 != 2) {
            System.out.println("El número introducido es incorrecto,intentelo de nuevo.");
            aux2 = scr.nextInt();
        }
        if (aux2 == 1) {
            cifrar();
        } else {
            descifrar();
        }
    }

    public static void cifrar() {

        while (num <= 1000 || num > 9999) {
            System.out.println("Introduzca un número de 4 dígitos:");
            num = scr.nextInt();
        }

        a[0] = num / 1000;
        aux = a[0] * 1000;
        a[1] = (num - aux) / 100;
        aux = aux + a[1] * 100;
        a[2] = (num - aux) / 10;
        aux = aux - a[2] * 10;
        a[3] = num - aux;

        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] + 7) % 10;
        }

        aux = a[0];
        a[0] = a[2];
        a[2] = aux;

        aux = a[1];
        a[1] = a[3];
        a[3] = aux;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void descifrar() {
        while (num < 0 || num > 9999) {
            System.out.println("Introduzca un número de 4 dígitos, "
                    + "si introduce un número menor se supondrá que las cifras a la izquierda son 0:");
            num = scr.nextInt();
        }
        if (num > 999) {
            a[0] = num / 1000;
            aux = a[0] * 1000;
            a[1] = (num - aux) / 100;
            aux = aux + a[1] * 100;
            a[2] = (num - aux) / 10;
            aux = aux + a[2] * 10;
            a[3] = num - aux;
        } else if (num > 99) {
            a[0] = 0;
            a[1] = num / 100;
            aux = a[1] * 100;
            a[2] = (num - aux) / 10;
            aux = aux + a[2] * 10;
            a[3] = num - aux;
        } else if (num > 9) {
            a[0] = 0;
            a[1] = 0;
            a[2] = num / 10;
            aux = a[2] * 10;
            a[3] = num - aux;
        } else {
            a[0] = 0;
            a[1] = 0;
            a[2] = 0;
            a[3] = num;

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 6) {
                a[i] = a[i] + 10 - 7;
            } else {
                a[i] = a[i] - 7;
            }
        }

        aux = a[0];
        a[0] = a[2];
        a[2] = aux;

        aux = a[1];
        a[1] = a[3];
        a[3] = aux;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        decision();
    }

}
