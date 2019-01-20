/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadyaltura2;

/**
 *
 * @author Aritz y Juan David
 */
public class EdadyAltura2 {

    public static void muestraEdadyAltura(byte edad, float altura) {
        edad = 33;
        altura = 2.05f;
        System.out.println("El valor de las variables en el método muestraEdadyAltura");
        System.out.println("Tengo " + edad + " años.");
        System.out.println("Mido" + altura);

    }

    public static void main(String[] args) {
        byte edad;
        float altura;
        edad = 55;
        altura = 1.75f;
        muestraEdadyAltura(edad, altura);
        System.out.println("Valor de las variables en el método main");
        System.out.println("Tengo" + edad + " años");
        System.out.println("Mido" + altura);
    }

}
