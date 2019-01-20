/*
Diseña un programa java que lea tres números en el main y se los pase a un método
que imprimirá por pantalla el mayor de ellos. Esté mñetodo estará en una clase d
distinta de otro paquete.
 */
package tema05_ejercicio03;

import javax.swing.JOptionPane;

import BuscarMayor.NumMayor;
/**
 *
 * @author Aritz y Juan David
 */
public class Tema05_Ejercicio03 {

    
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduzca el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ahora, introduzca un segundo número: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Por último, introduzca un tercer número: "));

        NumMayor.obtenerMayor(numero1, numero2, numero3);
        
    }
    
}
