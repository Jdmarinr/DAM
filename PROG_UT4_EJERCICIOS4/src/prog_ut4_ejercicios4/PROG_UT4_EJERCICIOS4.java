/*
Ejercicio 4: 
Dada en una lista no ordenada de 50 números y un número leído por teclado:
a) Codificar un método que busque en la lista el número leido. Si lo encuentra, 
debe informar de su posición en la lista, sino debe devolver cero.

b) Modificar el anterior para que devuelva el número de veces que aparece.


 */
package prog_ut4_ejercicios4;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT4_EJERCICIOS4 {

    static int numeros[] = new int[50];
    static int inverso[] = new int[50];
    static Scanner scr = new Scanner(System.in);
    static int num;
    static int cont = 0;
    static int contb = 0;
    static int contc = 0;
    static int contd = 0;
    static int aux, aux1;
    static int sumaN;
    static double media;
    static int sumasAux;

    public static void array50() {

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 50);
            //System.out.println(numeros[i]);
        }
    }

    public static void busqueda() {

        System.out.println("Introduzca un número: ");
        num = scr.nextInt();
        System.out.println("El número está en la(s) posicion(es): ");
        for (int i = 0; i < numeros.length; i++) {
            if (num != numeros[i]) {
                cont++;
            }
            if (num == numeros[i]) {
                System.out.println(i + 1);
            }
        }
        if (cont == 50) {
            System.out.println("0");
        }

    }

    public static void busquedaVeces() {

        for (int i = 0; i < numeros.length; i++) {

            if (num == numeros[i]) {
                contb++;
            }
        }
        System.out.println("El número de veces que aparece el número es: " + contb);

    }

    public static void mayor() {

        aux = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (aux < numeros[i]) {
                aux = numeros[i];
            }

        }

        for (int i = 0; i < numeros.length; i++) {
            if (aux == numeros[i]) {
                contc++;
            }
        }
        System.out.println("El número mayor es: " + aux);
        System.out.println("El número de veces que apareces es " + contc);

    }

    public static void numLeidoNumMayor() {

        if (contb > contc) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

    }

    public static void sumaMedia() {

        for (int i = 0; i < numeros.length; i++) {
            sumaN = sumaN + numeros[i];
        }

        media = sumaN / 50;
        System.out.println("La media de todos los números es: " + media);
    }

    public static void mediaMayMen() {
        aux1 = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (aux1 > numeros[i]) {
                aux1 = numeros[i];
            }

        }
        sumasAux = (aux + aux1) / 2;
        System.out.println("La media entre el mayor y el menor es: " + sumasAux);
    }

    public static void inverso() {
        int j = 49;
        
        for (int i = 0; i < numeros.length; i++) {
            inverso[j] = numeros[i];
            j--;

        }
        System.out.println("Array normal: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Array inverso: ");
        for (int i = 0; i < inverso.length; i++) {
            System.out.println(inverso[i]);
        }
    }

    public static void main(String[] args) {
        array50();
        System.out.println("\na)");
        busqueda();
        System.out.println("\nb)");
        busquedaVeces();
        System.out.println("\nc)");
        mayor();
        System.out.println("\nd)");
        numLeidoNumMayor();
        System.out.println("\ne)");
        sumaMedia();
        System.out.println("\nf)");
        mediaMayMen();
        System.out.println("\ng)");
        inverso();
    }

}
