/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librot2p2;

/**
 *
 * @author Aritz y Juan David
 */
public class Coche {
    private static int velocidad;
    Coche(){
        velocidad=0;
    }
    public static int getVelocidad(){
        return velocidad;
    }
    public static void acelera(int mas){
        velocidad += mas;
    }
    public static void frena(int menos){
        velocidad -= menos;
    }
    public static void main(String[] args) {
        acelera(70);                            //prueba de que acelera y frena funciona
        System.out.println(getVelocidad());
        frena(20);
        System.out.println(getVelocidad());
    }
    
    
}
