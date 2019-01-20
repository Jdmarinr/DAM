/*
Escriba un programa para calcular el cuadrado y el cubo de un número introducido por 
teclado
 */
package psinte1;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PsintE1 {

    public static void main(String[] args) {
       int cuadrado, cubo; 
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduzca un número: ");
       int a = entrada.nextInt();
       
        System.out.println("El cuadrado de ese número es: "+(Math.pow(a,2)));
        System.out.println("El cubo de ese número es: "+(Math.pow(a,3)));
    }
    
}
