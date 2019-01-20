/*
Imprimir las tablas de multiplicar.
 */
package tablasmultiplicar;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class TablasMultiplicar {

    public static void main(String[] args) {
        /*for (int i = 1 ; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
               System.out.println(i+"x"+j+"="+i*j+"\n"); 
            }
        }*/
        Scanner entrada = new Scanner(System.in);
        int a;
        System.out.println("Indica la tabla de multiplicar que quieres obtener: ");
        a = entrada.nextInt();
        System.out.println("La tabla de multiplicar de "+a+" es: ");
        for (int i=1;i<=10;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
}
