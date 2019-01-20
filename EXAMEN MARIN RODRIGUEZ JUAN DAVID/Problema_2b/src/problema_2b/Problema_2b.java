/*
Marín Rodríguez Juan David
 */
package problema_2b;

import java.util.Scanner;


public class Problema_2b {

   
    static Scanner scr = new Scanner(System.in);
    static String cadena1;
    static String cadena2;

    //metodo que pide al usuario que introduzca dos cadenas de caracteres
    public static void intro() {
        System.out.println("Introduzca la primera cadena de caracteres: ");
        cadena1 = scr.next();                          
        System.out.println("Introduzca la segunda cadena de caracteres: ");
        cadena2 = scr.next();                           
    }

    
    public static void comparacion() {
   
        if (cadena1.equalsIgnoreCase(cadena2)) {
            
            System.out.println("Las cadenas son iguales.");
        } else {    
            System.out.println("Las cadenas son distintas.");
        }
    }
    
    public static void main(String[] args) {
        intro();
        comparacion();
    }
    
}
