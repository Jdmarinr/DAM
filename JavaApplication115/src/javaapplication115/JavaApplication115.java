/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication115;

/**
 *
 * @author Aritz y Juan David
 */
public class JavaApplication115 {

    public static int a = 2, b = 0, c;

    public static void prueba() {
        
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error"+e.getMessage());
            c = 0;
        }
        
        
        
        System.out.println(c);
    }

    public static void main(String[] args) {
        prueba();
    }
}
