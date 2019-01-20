/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y estatura media, la cantidad de 
alumnos meyores de 18 años y la camtidad de alumnos que miden más de 1.75*/
package ejercicio15_prueba;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio15_prueba {

    //Variables
    static String m = "MARTES";
    static String x = "MIERCOLES";
    static String j = "JUEVES";
    static String v = "VIERNES";
    static String s = "SABADO";
    static String d = "DOMINGO";
    static String si = "SI";
    static String no = "NO";
    static int semanas;
    static int limDias;
    static double max;
    static double min; 
    static double tSemana;
    static double[] arr = new double[6];

    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    public static void ventaSemana() {

        System.out.println("Indique el número de semanas que quiere introducir:");
        semanas = sc1.nextInt();
        
        System.out.println("Introduzca las ventas de cada día de la semana:, exceptuando el lunes que no se trabaja");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                arr[i] = sc.nextDouble();
                max = arr[i];
                min = arr[i];
                tSemana = arr[i];
            }      
            else{
                arr[i] = sc.nextDouble();
                if (arr[i] > max){
                    max = arr[i];
                }
                if (arr[i] < min){
                    min = arr[i];
                }
                tSemana = tSemana + arr[i];
            }
        }
        
        System.out.println(max);
        System.out.println(min);
        System.out.println(tSemana/6);
    }

    public static void main(String[] args) {
        ventaSemana();
    }

}
