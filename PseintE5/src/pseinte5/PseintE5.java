package pseinte5;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PseintE5 {
    public static void main(String[] args) {
        System.out.println("Introduzca 3 números: ");
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        
        if (n1<0){
            System.out.println("El producto de los números es: "+(n1*n2*n3));
        }
        else {
            System.out.println("La suma de los números es : "+(n1+n2+n3));
        }
        
    }
    
}
