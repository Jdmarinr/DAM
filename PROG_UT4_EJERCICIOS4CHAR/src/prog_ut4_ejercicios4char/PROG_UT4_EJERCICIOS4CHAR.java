/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_ut4_ejercicios4char;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT4_EJERCICIOS4CHAR {

    static char letras[] = new char[50];
    static char inverso[] = new char[50];
    static Scanner scr = new Scanner(System.in);
    static char let;
    static int cont = 0;
    static int contb = 0;
    static int contc = 0;
    static int contd = 0;
    static char aux, aux1;
    static char sumaN;
    static int sumasAux;

    public static void array50Char() {

        for (int i = 0; i < letras.length; i++) {

            letras[i] = (char) (Math.random() * 26 + 97);
            System.out.println(letras[i]);
        }
    }

    public static void busqueda() {

        System.out.println("Introduzca una letra: ");
        let = scr.next().charAt(0);
        System.out.println("La letra está en la(s) posicion(es): ");
        for (int i = 0; i < letras.length; i++) {
            if (let != letras[i]) {
                cont++;
            }
            if (let == letras[i]) {
                System.out.println(i + 1);
            }
        }
        if (cont == 50) {
            System.out.println("0");
        }

    }

    public static void busquedaVeces() {

        for (int i = 0; i < letras.length; i++) {

            if (let == letras[i]) {
                contb++;
            }
        }
        System.out.println("El número de veces que aparece la letra es: " + contb);

    }

    public static void mayor() {

        aux = letras[0];

        for (int i = 1; i < letras.length; i++) {
            if (aux < letras[i]) {
                aux = letras[i];
            }

        }

        for (int i = 0; i < letras.length; i++) {
            if (aux == letras[i]) {
                contc++;
            }
        }
        System.out.println("La letra mayor es: " + aux);
        System.out.println("El número de veces que apareces es " + contc);

    }

    public static void numLeidoNumMayor() {

        if (contb > contc) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

    }

    public static void inverso() {
        int j = 49;

        for (int i = 0; i < letras.length; i++) {
            inverso[j] = letras[i];
            j--;

        }
        System.out.println("Array normal: ");
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        System.out.println("Array inverso: ");
        for (int i = 0; i < inverso.length; i++) {
            System.out.println(inverso[i]);
        }
    }

    public static void main(String args[]) {
        array50Char();
        System.out.println("\na)");
        busqueda();
        System.out.println("\nb)");
        busquedaVeces();
        System.out.println("\nc)");
        mayor();
        System.out.println("\ng)");
        inverso();
    }
}
