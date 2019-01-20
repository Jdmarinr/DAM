/*Indica el número de cifras que tiene un número introducido por teclado */
package ejercicio111_prueba;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio111_prueba {
    
    static Scanner sc = new Scanner(System.in);
    static int aux;             
    static int nCifras;
    static int cont = 1;
    
    public static void numeroCifras(){
        System.out.println("Introduzca un número:");
        nCifras = sc.nextInt();
        aux = nCifras;
        while(aux >= 9){
            aux = aux/10;
            cont++;
        }
        System.out.println("El número " + nCifras + " tiene " + cont + " cifras.");
    }
    public static void main(String[] args) {
        numeroCifras();    
    } 
}
