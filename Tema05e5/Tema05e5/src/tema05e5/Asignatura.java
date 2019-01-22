package tema05e5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jdmarin
 */
public class Asignatura {

    public static void main(String[] args) {

        Ciclo arrayAsignatura[] = new Ciclo[6];  //Creamos array de objetos Ciclo
        
        //Atributos que luego se utilizarán como argumentos
        String asignatura;  
        int nota;

        for (int i = 0; i < arrayAsignatura.length; i++) {
            asignatura = JOptionPane.showInputDialog("Introduzca el nombre de la asignatura: ");
            arrayAsignatura[i] = new Ciclo(asignatura);

            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota de " + asignatura));
            arrayAsignatura[i].setNota(nota);
        }

        System.out.println("Su nota media del curso es de: " + Ciclo.getMedia());
    }

}
