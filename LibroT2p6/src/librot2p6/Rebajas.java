/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librot2p6;

/**
 *
 * @author Aritz y Juan David
 */
public class Rebajas {
    
    public static double descubrePorcentaje(double pOriginal, double pRebajado){
        
        return 100-(pRebajado*100)/pOriginal;
    }
    public static void main(String[] args) {
        System.out.println(descubrePorcentaje(100, 66)+"%");
    }
    
}
