/*
Escriba un programa Java que imprima por pantalla todos los números, 
menos aquellos que terminan en 6, desde el 1 al número que introduce el usuario por pantalla.
 */
package ejercicio113_prueba;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio113_prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Introduzca un número:");
        n = sc.nextInt();
        int j = 6;
        for (int i = 1; i <= n; i++) {
           if(i==j){
               j = j + 10;
           }
           else{
               System.out.println(i);
           }
        }
    }
    
}
