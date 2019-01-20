/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psinte3;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PsintE3 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
     
       System.out.println("Introduzca un número: ");
       int a = entrada.nextInt();
       if(a%2==0){
           System.out.println("El número "+a+" es un número par");
       }
       else{
           System.out.println("El número "+a+" es un número impar");
       }
    }
    
}
