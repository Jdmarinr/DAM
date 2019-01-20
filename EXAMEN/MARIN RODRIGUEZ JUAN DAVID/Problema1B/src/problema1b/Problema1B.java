/*
Marín Rodríguez, Juan David.
Modifica el programa anterior para que el número final sea introducido por el teclado.
 */
package problema1b;

import java.util.Scanner;

/**
 *
 * @author Juan David
 */
public class Problema1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaP = 0;                                                          //Definimos la variable con la que sumaremos los pares, inicialmente vale cero.
        int sumaImp = 0;                                                        //Definimos la variable con la que sumaremos los impares, inicialmente vale cero.
        double n;

        System.out.println("Introduzca el número hasta el cual quiere sumar los pares y los impares: ");
        n = entrada.nextDouble();
        for (int i = 1; i <= n; i++) {                                          //Hacemos un bucle for que inicie en uno y llegue hasta el número que ha introducido el usuario.
            if (i % 2 == 0) {                                                   //En caso de que el número en el que se encuentre el bucle sea par, sumaremos pares.
                sumaP = sumaP + i;
            } else {
                sumaImp = sumaImp + i;                                          //En caso de que el número en el que se encuentre el bucle sea impar, sumaremos impares.
            }
        }
        System.out.println("La suma de los números pares es: " + sumaP + "\nLa suma de los números impares es: " + sumaImp);

    }

}
