package psinte9;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PsintE9 {

    public static void main(String[] args) {
        System.out.println("Introduzca tres números: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        if(n1 >= n2 && n1 >= n3){
            System.out.println("El mayor es: "+n1);
        }
        else if (n2 >= n1 && n2>= n3){
            System.out.println("El mayor es: "+n2);
        }
        else {
            System.out.println("El mayor es: "+n3);
        }
    }
    
}
