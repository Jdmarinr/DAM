/*
Realizar un programa en Java en el cual se le pide al usuario (en el main) un número
por teclado. Luego se llamará a un método que pasándole un número introducido por
el usuario, nos dirá si el número introducido es positivo o negativo.
 */
package tema05_ejercicio01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema05_Ejercicio01 {


    public static void pedir (int numero){
        
        if (numero>0) {
            System.out.println("El número introducido es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        
    }
    
    
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
        pedir(numero);
    }
    
}
