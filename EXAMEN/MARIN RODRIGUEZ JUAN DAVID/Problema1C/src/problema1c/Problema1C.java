/*
Marín Rodríguez, Juan David.
 */
package problema1c;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Problema1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int sumaP = 0;                //Definimos la variable con la que sumaremos los pares, inicialmente vale cero.
        int sumaImp = 0;                //Definimos la variable con la que sumaremos los impares, inicialmente vale cero.
        double n;

        System.out.println("Introduzca el número hasta el cual quiere sumar los pares y los impares. Debe ser mayor que 100: ");            //Solicitamos el número con las indicaciones necesarias.
        n = entrada.nextDouble();

        while (n <= 100) {                                                                                //Hacemos un bucle while para pedir cuantas veces sea necesario que el número sea mayor que 100.
            System.out.println("Número inválido. Por favor, introduzca un número mayor que 100:");
            n = entrada.nextDouble();
        }

        for (int i = 1; i <= n; i++) {                                                                  //Hacemos un bucle for que inicie en uno y llegue hasta el número que ha introducido el usuario.
            if (i % 2 == 0) {                                                                           //En caso de que el número en el que se encuentre el bucle sea par, sumaremos pares.
                sumaP = sumaP + i;
            } else {
                sumaImp = sumaImp + i;                                                                  //En caso de que el número en el que se encuentre el bucle sea impar, sumaremos impares.
            }
        }

        System.out.println("La suma de los números pares es: " + sumaP + "\nLa suma de los números impares es: " + sumaImp); //Decimos cuánto es la suma de los pares, y de los números impares.

    }

}
