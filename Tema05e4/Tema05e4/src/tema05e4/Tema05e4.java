/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05e4;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema05e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pajarito p1 = new Pajarito();
        Pajarito p2 = new Pajarito();
        
        p1.establecerColoryEdad("Rojo", 1);
        p2.establecerColoryEdad("Azul", 2);
        System.out.println("El número de objetos creados es de: "+ Pajarito.muestraPajaros());

    }
    
}
