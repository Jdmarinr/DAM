/*
Escribir un algoritmo en Java que pida tres números (en el main) y se los pase a un 
método que los imprimirá por pantalla el menor  de ellos. Este método estará en una
clase distinta del mismo paquete.
 */
package tema05_ejercicio04;

import javax.swing.JOptionPane;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema05_Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int numero1;
        int numero2;
        int numero3;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduzca el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ahora, introduzca un segundo número: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Por último, introduzca un tercer número: "));

        ObtenerMenor.menor(numero1, numero2, numero3);
    }
    
}
