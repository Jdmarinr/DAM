/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05e1;

/**
 *
 * @author Aritz y Juan David
 */
public class Test {

  

    public static void main(String[] args) {
        
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        
        miCoche.establecerModelo("A8");
        miCoche.establecerMarca("Audi");
        miCoche.establecerColor("Amarillo");
        
        cochePadre.establecerModelo("Pajero");
        cochePadre.establecerMarca("Mitsubishi");
        cochePadre.establecerColor("Verde mango");
        
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }
        
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }
        
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }
        
        cochePadre.apagarCoche();
        
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();
    }

}
