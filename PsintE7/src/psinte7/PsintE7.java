/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psinte7;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PsintE7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Introduzca un número amigo: ");
        Scanner entrada = new Scanner(System.in);
        int t,h,m,s;
        
        t = entrada.nextInt();
        h = t/3600;                 //se pasan los segundos a horas
        m = (t - h*3600)/60;        //a los segundos totales se le restan las horas convertidas en segundos y se pasa a minutos
        s = t - h*3600 - m*60;      //a los segundos totales se le restan las horas y los minutos convertidos en segundos y da los segundos que sobran
        System.out.println("El tiempo introducido en segundos son "+h+" horas, "+m+" minutos y "+s+" segundos.");    
        
        /*int m1,s1;
        m1 = (t%3600)/60;         //divide entre 60 el resto de calcular las horas
        s1 = (t%3600)%60;           //devuelve el resto de dividir entre 60 el resto de calcular las horas
        System.out.println("El tiempo introducido en segundos son "+h+" horas, "+m1+" minutos y "+s1+" segundos.");*/   
    }    
}
