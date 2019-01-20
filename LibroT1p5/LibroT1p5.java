/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librot1p5;

/**
 *
 * @author dam
 */
public class LibroT1p5 {

    int edad, nivel_de_estudios, ingresos;
    
    public static void main(String[] args) {
        boolean jasp;
        int edad = 27;
        int nivel_de_estudios = 4;
        int ingresos = 28000;
        
        if (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000){
            jasp = true;
        }
        else{
            jasp = false;
        }
    }   
}
