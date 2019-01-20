/*
Ejercicio 15: Introducir un día, un mes, y un año y decir si la fecha es correcta. En este ejercicio todos los meses tienen 30 días.
 */
package ada15;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class ADA15 {

    static int dia;
    static int mes;
    static int año;

    static Scanner scr = new Scanner(System.in);

    public static void fechas() {
        System.out.println("Por favor introduzca un día: ");
        dia = scr.nextInt();
        System.out.println("Por favor introduzca un mes: ");
        mes = scr.nextInt();
        System.out.println("Por favor introduzca un año: ");
        año = scr.nextInt();

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    System.out.println("La fecha introducida es correcta.");
                } else {
                    System.out.println("Esta fecha es incorrecta.");
                }
            } else {
                System.out.println("Esta fecha es incorrecta.");
            }
        } else {
            System.out.println("Esta fecha es incorrecta.");
        }

    }

    public static void main(String[] args) {
        fechas();
    }

}
