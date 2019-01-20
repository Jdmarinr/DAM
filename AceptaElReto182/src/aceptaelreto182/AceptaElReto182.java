package aceptaelreto182;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class AceptaElReto182 {

    static int n = -1;
    static int cont = 0;
    static int[] ar, aux;
    static int auxiliar;
    static Scanner sc = new Scanner(System.in);

    public static void persMultiplicativa() {
        while (n < 0) {
            System.out.println("Introduzca el número de casos que quiere: ");
            n = sc.nextInt();
        }
        ar = new int[n];
        System.out.println("Introduzca " + n + " número(s): ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            while (ar[i] < 0 || ar[i] >= 10000) {
                System.out.println("Introduzca de nuevo el " + (i + 1) + "º número:");
                ar[i] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            auxiliar = ar[j];
            while (auxiliar > 999) {
                aux = new int[4];
                aux[0] = auxiliar / 1000;
                auxiliar = auxiliar - aux[0] * 1000;
                aux[1] = auxiliar / 100;
                auxiliar = auxiliar - aux[1] * 100;
                aux[2] = auxiliar / 10;
                auxiliar = auxiliar - aux[2] * 10;
                aux[3] = auxiliar;
                cont++;
                auxiliar = aux[0] * aux[1] * aux[2] * aux[3];
            }
            while (auxiliar > 99 && auxiliar <= 9999) {
                aux = new int[3];
                aux[0] = auxiliar / 100;
                auxiliar = auxiliar - aux[0] * 100;
                aux[1] = auxiliar / 10;
                auxiliar = auxiliar - aux[1] * 10;
                aux[2] = auxiliar;
                cont++;
                auxiliar = aux[0] * aux[1] * aux[2];
            }
            while (auxiliar > 9 && auxiliar <= 99) {
                aux = new int[2];
                aux[0] = auxiliar / 10;
                auxiliar = auxiliar - aux[0] * 10;
                aux[1] = auxiliar;
                cont++;
                auxiliar = aux[0] * aux[1];
            }
            System.out.println("El número " + ar[j]+ " tiene una persistencia multiplicativa de " + cont);
            cont=0;
        }

    }

    public static void main(String[] args) {
        persMultiplicativa();
    }

}
