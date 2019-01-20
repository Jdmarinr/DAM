/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05_ejercicio04;

/**
 *
 * @author Aritz y Juan David
 */
public class ObtenerMenor {
    
    public static void menor (int num1, int num2, int num3) {

       
        if ((num1 < num2)&& (num2<num3)) {
            System.out.println("El número menor es "+num1);
        } else if ((num2< num1)&&(num1<num3)){
            System.out.println("El número menor es "+num2);
        }else {
            System.out.println("El número menor es "+num3);
        }
        
        
    }
    
    
}
