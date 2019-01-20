/*
Realiza un programa en el que le solicites en el main al usuario 2 números, y si el primer 
número introducido es mayor que 10, se llamará a un método que los multiplicará
y mostrará el resultado, y en caso contrario se llamará a un método que los sume.
Estos dos métodos estarán en una clase distinta en el mismo paquete. Muestra la operación
realizada y el resultado.
 */
package tema05_ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema05_Ejercicio02 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1;
        int numero2;
        System.out.println("Por favor introduzca un número: ");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número: ");
        numero2= entrada.nextInt();
        
        if (numero1>10) {
            Operaciones.multiplicar(numero1, numero2);
        }else {
            Operaciones.sumar(numero1, numero2);
        }
    }
    
}
