/*
Ejercicio 17: Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. Suponer que todos los meses tienen 30 días.
 */
package ada17;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class ADA17 {

    static int dia;
    static int mes;
    static int año;

    static Scanner scr = new Scanner(System.in);

    public static void fechas() {
        System.out.println("Por favor introduzca un día: ");
        dia = scr.nextInt();
        while (dia < 1 || dia > 30) {
            System.out.println("Día inválido. Por favor introduzca un día: ");
            dia = scr.nextInt();
        }
        System.out.println("Por favor introduzca un mes: ");
        mes = scr.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Mes inválido. Por favor introduzca un mes: ");
            mes = scr.nextInt();
        }
        System.out.println("Por favor introduzca un año: ");
        año = scr.nextInt();
        while (año == 0) {
            System.out.println("Año inválido. Por favor introduzca un año: ");
            año = scr.nextInt();
        }

        if (dia == 30) {
            if (mes == 12) {
                dia = 1;
                mes = 1;
                año++;
            } else {
                dia = 1;
                mes++;
            }
        } else {
            dia++;
        }
        System.out.println("El siguiente día es: " + dia + "/" + mes + "/" + año);
    }

    public static void main(String[] args) {
        fechas();
    }

}
