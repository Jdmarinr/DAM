/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosoperacion;

/**
 *
 * @author Aritz y Juan David
 */
public class VisualizarMedia {

    static void visualizarMedia(float x, float y) {
        float resultado = 0;
        if((x<0) || (y<0)){
            System.out.println("X e Y deben ser positivos");
        }
        else{
            resultado = (x+y)/2;
            System.out.println("La media es: " + resultado);
        }
    }

}
