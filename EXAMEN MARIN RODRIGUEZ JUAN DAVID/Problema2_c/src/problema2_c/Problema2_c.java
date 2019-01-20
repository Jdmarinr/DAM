/*
Marín Rodríguez, Juan David.
 */
package problema2_c;

import java.util.Scanner;


public class Problema2_c {

     
    static Scanner scr = new Scanner(System.in);
    static String cadena;

    
    public static void intro() {                                                //Método que pide al usuario que introduzca una cadena de caracteres
        System.out.println("Introduzca una cadena de carácteres: ");
        cadena = scr.next(); 
    }

    
    public static void cambioDeE(){
       
        String cad = cadena.replace('e', 'a');                                  //Cambiamos las letras e por a
        System.out.println(cad);                        //Se imprime la cadena
    }

    public static void main(String[] args) {
        intro();
        cambioDeE();
    }
    
    
    
}
