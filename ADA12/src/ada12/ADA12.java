/*Pide un número entre 0 y 9999 y mostrarlo con las cifras al revés */
package ada12;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class ADA12 {

    static int n, aux;
    static int[] ar;
    static Scanner sc = new Scanner(System.in);

    public static void cifras() {

        System.out.println("Introduzca un número entre 0 y 9999:");
        n = sc.nextInt();
        while (n < 0 || n > 9999) {
            System.out.println("Número inválido.\nIntroduzca un número entre 0 y 9999:");
            n = sc.nextInt();
        }
        aux = n;
        if (n > 999) {
            ar = new int[4];
            ar[0] = aux / 1000;
            aux = aux - ar[0] * 1000;
            ar[1] = aux / 100;
            aux = aux - ar[1] * 100;
            ar[2] = aux / 10;
            aux = aux - ar[2] * 10;
            ar[3] = aux;
        } else if (n > 99 && n <= 9999) {
            ar = new int[3];
            ar[0] = aux / 100;
            aux = aux - ar[0] * 100;
            ar[1] = aux / 10;
            aux = aux - ar[1] * 10;
            ar[2] = aux;
        } else if (n > 9 && n <= 99) {
            ar = new int[2];
            ar[0] = aux / 10;
            aux = aux - ar[0] * 10;
            ar[1] = aux;
        } else if (n >= 0 && n <= 9) {
            ar = new int[1];
            ar[0] = aux;
        }
    }

    public static void delReves() {
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        cifras();
        delReves();
    }

}
