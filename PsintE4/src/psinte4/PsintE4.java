/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psinte4;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PsintE4 {

    public static void main(String[] args) {
        
        ordenar2Numeros();       
        
    }
    
    public static void ordenar2Numeros(){
        System.out.println("Ingrese dos números: ");
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        if (a<=b) {
            System.out.println(a+"<"+b);
        } else {
            System.out.println(b+"<"+a);
        }
    }
    
}
