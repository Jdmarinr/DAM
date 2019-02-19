/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_ut5_ej2;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT5_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1, 5, 6, 10, 3, 3, 2};
        LibroCalificaciones asdf = new LibroCalificaciones("Programación", array);
        System.out.println("La nota máxima es: " + asdf.obtenerMaximo());
        System.out.println("La nota mínima es: " + asdf.obtenerMinimo());
        System.out.println("La nota media es: " + asdf.obtenerMedia());
        asdf.imprimirGraficoBarras();
    }

}
