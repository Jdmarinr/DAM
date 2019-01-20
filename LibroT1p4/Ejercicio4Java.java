/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4java;


/**
 *
 * @author dam
 */
public class Ejercicio4Java {

    public static void main(String[] args) {
        int a = 5;      //inicializamos a y b con un valor cualquiera
        int b = 17;
        
        int paso;       //definimos una variable de paso
        
        paso = a;       //guardamos en la variable de paso el valor de a
        a = b;          //guardamos en a el valor de b  
        b = paso;       //guardamos en b el valor de paso (a inicial)
        
        System.out.println(a);
        System.out.println(b);
    }
    
}
