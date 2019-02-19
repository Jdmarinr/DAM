/*
Marín Rodríguez, Juan David
 */
package problema_2a;

import java.util.Scanner;

public class Problema_2a {

    public static Scanner scr = new Scanner(System.in);
    public static char[] cadena;

    public static void caract() {

        System.out.println("Introduzca una cadena de caracteres: ");
        String cad = scr.next();  
        cadena = cad.toCharArray();   

    }
    
      public static void vocales() {
        
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int cont = 0;   
        
        
        for (int i = 0; i < cadena.length; i++) {  
            for (int j = 0; j < vocales.length; j++) {  
                if (cadena[i] == vocales[j]) {     
                    cont++;
                }
            }
        }
        
        System.out.println("La cadena introducida tiene " + cont + " vocales.");
    }

    public static void main(String[] args) {
        caract();
        vocales();
    }

}
