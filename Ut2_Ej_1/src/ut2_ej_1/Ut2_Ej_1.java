/*
 Escribe un programa en Java que lea la altura en metros de una persona y su
edad y obtenga su peso recomendado de acuerdo a la siguiente fórmula:
peso recomendado = (altura en cm – 100 + diez por ciento de la edad) * 0,9
 */
package ut2_ej_1;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Ut2_Ej_1 {

    static double alt;
    static double pesoRec;
    static int edad;
    static double altCm;
    static Scanner entrada = new Scanner(System.in);

    public static void pesoRecomendado() {

        System.out.println("Introduzca su edad: ");
        edad = entrada.nextInt();
        System.out.println("Introduzca su altura: ");
        alt = entrada.nextDouble();

        altCm = alt * 100;

        pesoRec = (altCm - 100 + edad * 0.10) * (0.9);
        System.out.println("El peso recomendado para su edad y altura es: " + pesoRec + " Kg");
    }

    public static void main(String[] args) {
        pesoRecomendado();
    }

}
