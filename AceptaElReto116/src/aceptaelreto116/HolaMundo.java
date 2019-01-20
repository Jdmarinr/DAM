package aceptaelreto116;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class HolaMundo {

 
    public static void main(String[] args) {
        holaMundoNVeces();
    }
    
    public static void holaMundoNVeces(){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        if(n>=0 && n<=5){
            for (int i = 0; i < n; i++) {          
                  System.out.println("Hola Mundo.");
                }
            }
        else{
            System.out.println("Aprende a leer amigo.");
        }
    }  
}
