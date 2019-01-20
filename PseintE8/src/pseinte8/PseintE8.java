
package pseinte8;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PseintE8 {

    public static void main(String[] args) {
        System.out.println("Escriba una temperatura: ");
        Scanner entrada = new Scanner(System.in);
        int t= entrada.nextInt();
        
        if (t>30){
            System.out.println("El deporte apropiado es la natación");
        }
        else if(15<t && t<=30) {
            System.out.println("El deporte apropiado es el golf");
                }
         else if(5<t && t<=15) {
            System.out.println("El deporte apropiado es el tenis");
                }
         else if(-10<t && t<=5) {
            System.out.println("El deporte apropiado es el esquí");
                }
         else { 
            System.out.println("El deporte apropiado son las damas");
         }
    }
    
}
