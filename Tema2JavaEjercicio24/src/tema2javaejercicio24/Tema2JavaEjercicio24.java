/*
Ejercicio 24 (obligatorio): Desarrolla un programa en el que le pidas al usuario un número 
de 4 cifras y muestre por pantalla cada una de las cifras que lo forman.
 */
package tema2javaejercicio24;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema2JavaEjercicio24 {
    
    static int n, c1, c2, c3, c4, aux;
    static Scanner sc = new Scanner(System.in);
    
    public static void cifras(){
        System.out.println("Introduzca un número de 4 cifras:");
        n = sc.nextInt();
        while(n < 999 || n > 9999){
            System.out.println("Número inválido.\nIntroduzca un número de 4 cifras:");
            n = sc.nextInt();
        }
        aux = n;
        c1 = aux/1000;
        aux = aux - c1*1000;
        c2 = aux/100;
        aux = aux - c2*100;
        c3 = aux/10;
        aux = aux - c3*10;
        c4 = aux;
        System.out.println("La primera cifra es: " + c1 + "\nLa segunda cifra es: " + c2 + 
                "\nLa tercera cifra es: " + c3 + "\nLa cuarta cifra es: " + c4);
    }
    public static void main(String[] args) {
        cifras();
        
        
        
    }
    
}
