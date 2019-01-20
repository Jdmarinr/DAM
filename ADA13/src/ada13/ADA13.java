/*Pide un número entre 0 y 9999 y dice si es capicua*/
package ada13;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class ADA13 {

    static int n, aux;                                      //Definimos las variables: n como número que introducirá el usuario y aux como variable auxiliar.
    static int[] ar = new int[4];                           //Creamos un array en el que guardaremos cada cifra que tenga el número
    static Scanner sc = new Scanner(System.in);

    public static void cifras() {

        System.out.println("Introduzca un número entre 0 y 9999:");
        n = sc.nextInt();
        while (n < 0 || n > 9999) {                         //Si el número introducido no está entre 0 y 9999 repetimos este bucle para que el usuario introduzca un número entre 0 y 9999.
            System.out.println("Número inválido.\nIntroduzca un número entre 0 y 9999:");           
            n = sc.nextInt();
        }
        aux = n;                                //Guardamos en aux el número introducido
        if (n > 999) {                          //Si el número introducido tiene 4 cifras
            ar = new int[4];                    //Se define la longitud del array dependiendo de las cifras que tenga el número
            ar[0] = aux / 1000;                 //El número se divide entre 1000 para obtener la primera cifra
            aux = aux - ar[0] * 1000;           //Actualizamos la variable aux restándole el valor de la primera cifra del número introducido multiplicado por 1000
            ar[1] = aux / 100;                  //Para obtener la siguiente cifra el valor de aux se divide por 100
            aux = aux - ar[1] * 100;            //Actualizamos la variable aux restándole el valor de la primera cifra del número introducido multiplicado por 100
            ar[2] = aux / 10;                   //Para obtener la siguiente cifra el valor de aux se divide por 10
            aux = aux - ar[2] * 10;             //Actualizamos la variable aux restándole el valor de la primera cifra del número introducido multiplicado por 10
            ar[3] = aux;                        ////Para obtener la siguiente cifra se coge el valor de aux
        } else if (n > 99 && n <= 9999) {       //Si el número tiene 3 cifras
            ar = new int[3];                    
            ar[0] = aux / 100;
            aux = aux - ar[0] * 100;
            ar[1] = aux / 10;
            aux = aux - ar[1] * 10;
            ar[2] = aux;
        } else if (n > 9 && n <= 99) {          //Si el número introducido tiene 2 cifras
            ar = new int[2];
            ar[0] = aux / 10;
            aux = aux - ar[0] * 10;
            ar[1] = aux;
        } else if (n >= 0 && n <= 9) {          //Si el número introducido tiene 1 cifra
            ar = new int[1];
            ar[0] = aux;
        }
    }

    public static void capicua() {
        
        switch (ar.length) {                                            //Hacemos un switch para conocer si el número es capicúa o no.
            case 4:                                                     //Si el array tiene longitud 4
                if (ar[0] == ar[3] && ar[1] == ar[2]) {                         //Establecemos las condiciones que nos dirán si el número es capicúa, en este caso,                                                                     
                    System.out.println("El número es capicúa.");                //si la primera cifra y la última, además de la segunda y la penúltima coinciden.
                } else {                                                        //Se hace de manera similar en los demás casos.
                    System.out.println("El número no es capicúa.");
                }
                break;
            case 3:                                                     //Si el array tiene longitud 3
                if (ar[0] == ar[2]) {
                    System.out.println("El número es capicúa.");
                } else {
                    System.out.println("El número no es capicúa.");
                }
                break;
            case 2:                                                     //Si el array tiene longitud 2
                if (ar[0] == ar[1]) {
                    System.out.println("El número es capicúa.");
                } else {
                    System.out.println("El número no es capicúa.");
                }
                break;
            case 1:                                                     //Si el array tiene longitud 1
                System.out.println("Un número de una sola cifra siempre es capicúa.");
                break;
        }
    }

    public static void main(String[] args) {
        cifras();
        capicua();
    }
}
