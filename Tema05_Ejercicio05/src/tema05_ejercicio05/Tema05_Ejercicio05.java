/*
Implementa un algoritmo en Java que le pida al usuario un número por teclado (en el main).
Ese número se lo pasaremos a un método que nos dirá si el número introducido es par o impar.
Este método estará en una clase distinta de otro paquete.
 */
package tema05_ejercicio05;

import javax.swing.JOptionPane;
import ParImpar.IntroPar;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema05_Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
        
        IntroPar.ParImpar(numero);
        
    }
    
}
