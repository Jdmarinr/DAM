/*Imprime por patanlla todos aquellos números que terminan en 6 
desde el 1 al número que introduce el usuario por pantalla.*/
package ejercicio112_prueba;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio112_prueba {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] ar = new int[100];
    
    public static void acabaEnSeis(){
        System.out.println("Introduzca un número:");
        n = sc.nextInt();
        int j = 0;
        for (int i = 6; i <= n; i = i + 10) {
            ar[j] = i;
            j++;
        }
        System.out.println("Entre el 1 y el " + n + " los número que terminan en 6 son:");
        for (int i = 0; i < 100; i++) {
            if(ar[i]!=0)
                System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        acabaEnSeis();
    }
    
}
