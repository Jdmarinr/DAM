/*
Lee un dia de la semana que introduce el usuario y según sea su valor escribe su posición en la semana.
 */
package tema04_javaejercicio23;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema04_JAVAEjercicio23 {

    static String dia;
    static Scanner sc = new Scanner(System.in);

    public static void posicion() {
        System.out.println("Introduzca un día de la semana, señor/a: ");
        dia = sc.next();
        while (dia.equals("Lunes") == false && dia.equals("Martes")==false && dia.equals("Miércoles")==false
                && dia.equals("Jueves")== false && dia.equals("Viernes")==false && dia.equals("Sábado")==false
                && dia.equals("Domingo") == false) {

            System.out.println("O esto no es un día de la semana o no tienes nipu de escribir, hermano."
                    + "\nIntroduzca un día de la semana, señor/a: ");
            dia = sc.next();
        }

        switch (dia) {
            case "Lunes":
                System.out.println("El " + dia + " es el primer día de sufrimiento.");
                break;
            case "Martes":
                System.out.println("El " + dia + " es el segundo día de sufrimiento.");
                break;
            case "Miércoles":
                System.out.println("El " + dia + " es el tercer día de sufrimiento.");
                break;
            case "Jueves":
                System.out.println("El " + dia + " es el cuarto día de sufrimiento.");
                break;
            case "Viernes":
                System.out.println("El " + dia + " es el último día de sufrimiento.");
                break;
            case "Sábado":
                System.out.println("El " + dia + " es el primer día de alegría.");
                break;
            case "Domingo":
                System.out.println("El " + dia + " es el segundo día de alegría.");
                break;
        }
    }

    public static void main(String[] args) {
        posicion();
    }

}
