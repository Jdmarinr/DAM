package psinte2;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PsintE2 {

    public static void main(String[] args) {
        System.out.println("Introduzca el radio:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("La longitud de la circunferencia con radio "+r+" es: "+(2*Math.PI*r));
        System.out.println("El area de la circunferencia con radio "+r+" es: "+(Math.PI*Math.pow(r, 2)));
    }
    
}
