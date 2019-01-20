/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscarMayor;

/**
 *
 * @author Aritz y Juan David
 */
public class NumMayor {
      public static void obtenerMayor(int num1, int num2, int num3) {

       
        if ((num1 > num2)&& (num2>num3)) {
            System.out.println("El número mayor es "+num1);
        } else if ((num2> num1)&&(num1>num3)){
            System.out.println("El número mayor es "+num2);
        }else {
            System.out.println("El número mayor es "+num3);
        }
        
        
    }
}
