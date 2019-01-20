/*
Dado un dígito entre 1 y 7 para determinar el día de la semana, 
escribe el anterior y el posterior.
 */
package prog_ut4_ejercicios2;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT4_EJERCICIOS2 {

    static String[] semana = new String[7];
    static int dia = 0;

    static Scanner sc = new Scanner(System.in);

    public static void semana() {
        semana[0] = "Lunes";
        semana[1] = "Martes";
        semana[2] = "Miercoles";
        semana[3] = "Jueves";
        semana[4] = "Viernes";
        semana[5] = "Sabado";
        semana[6] = "Domingo";
    }

    public static void antYPost() {
        while (dia <= 0 || dia > 7) {
            System.out.println("Introduzca un número entre el 1 y el 7 que equivale a un día de la semana:");
            dia = sc.nextInt();
        }
        switch (dia) {
            case 1:
                System.out.println(semana[6] + "\n" + semana[1]);
                break;
            case 2:
                System.out.println(semana[0] + "\n" + semana[2]);
                break;
            case 3:
                System.out.println(semana[1] + "\n" + semana[3]);
                break;
            case 4:
                System.out.println(semana[2] + "\n" + semana[4]);
                break;
            case 5:
                System.out.println(semana[3] + "\n" + semana[5]);
                break;
            case 6:
                System.out.println(semana[4] + "\n" + semana[6]);
                break;
            case 7:
                System.out.println(semana[5] + "\n" + semana[0]);
                break;
        }
    }

    public static void main(String[] args) {
        semana();
        antYPost();
    }

}
