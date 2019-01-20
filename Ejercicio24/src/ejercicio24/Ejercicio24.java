/*Imprime todos los números múltiplos de 3 que existen entre el número 1 y otro número introducido por el usuario. 
Controla que el usuario meta un número mayor que 0 y si no, avisa del error y vuelve a pedirlo las veces que haga falta. 
También informa al usuario del total de números totales.*/
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio24 {

    //Variables
    static int cont = 0;
    static int n;
    static int[] ar = new int[100];
    static Scanner sc = new Scanner(System.in);

    public static void multiplosDeTres() {
        System.out.println("Introduzca un número mayor que 0:");
        //guardamos en n el número introducido por teclado
        n = sc.nextInt();
        //mientras el número introducido es menor o igual que 0 avisa de que no es válido y lo vuelve a pedir
        while (n <= 0) {
            System.out.println("El número introducido no es válido. \nIntroduzca un número mayor que 0:");
            n = sc.nextInt();
        }
        //para todo i empezando por 1 que sea menor o igual que el número introducido
        for (int i = 1; i <= n; i++) {
            //si el resto de dividir i entre 3 es 0 guarda el valor en el array y suma uno al contador de múltiplos
            if (i % 3 == 0) {
                ar[cont] = i;
                cont++;
            }
        }
        //imprime por pantalla los datos
        System.out.println("El número de múltiplos de 3 entre 1 y " + n + " es: " + cont + "\nSon los siguientes:");
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] != 0) {
                System.out.println(ar[i]);
            }
        }
    }

    public static void multiploDeTres() {
        System.out.println("Introduzca un número mayor que 0:");
        //guardamos en n el número introducido por teclado
        n = sc.nextInt();
        //mientras el número introducido es menor o igual que 0 avisa de que no es válido y lo vuelve a pedir
        while (n <= 0) {
            System.out.println("El número introducido no es válido. \nIntroduzca un número mayor que 0:");
            n = sc.nextInt();
        }
        //para todo i empezando por 3 que sea menor o igual que el número introducido, va sumándole 3 a i
        for (int i = 3; i <= n; i = i + 3) {
            //imprime por pantalla todo i
            System.out.println(i + " es múltiplo de 3.");
            cont++;
        }
        //imprime por pantalla el número de múltiplos de 3 que hay entre 1 y el número introducido
        System.out.println("El número de múltiplos de 3 entre 1 y " + n + " es: " + cont);
    }

    public static void main(String[] args) {
        //método con array
        multiplosDeTres();
        //método sin array
        multiploDeTres();
    }

}
