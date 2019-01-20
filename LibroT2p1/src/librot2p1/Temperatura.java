/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librot2p1;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Temperatura {
    
    public static double farenheitACelsius(double f){
        return (f-32)/1.8;
    }
    
    public static double celsiusAFarenheit(double c){
        return 1.8*c+32;
    }
    
    public static void main(String[] args) {
        System.out.println("Introduzca los grados Farenheit a convertir: ");
        Scanner entradaF = new Scanner(System.in);
        double f = entradaF.nextDouble();
        System.out.println("Introduzca los grados Celsius a convertir: ");
        Scanner entradaC = new Scanner(System.in);
        double c = entradaC.nextDouble();
        System.out.println(f +" grados Farenheit son "+ farenheitACelsius(f) +" grados Celsius.");
        System.out.println(c +" grados Celsius son " + celsiusAFarenheit(c) + " grados Farenheit.");
    }  
    
}
