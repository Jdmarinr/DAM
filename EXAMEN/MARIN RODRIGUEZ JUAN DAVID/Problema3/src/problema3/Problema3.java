/*
Marín Rodríguez, Juan David.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                               //Definimos las variables que necesitamos utilizar:
        int op;                                                                 //Definimos la variable op, que nos indicará que operación se quiere hacer.
        int num1;                                                               //Definimos num1, como el primer número a introducir por el usuario.
        int num2;                                                               //Definimos num2, como el primer número a introducir por el usuario.
        int suma;                                                               //Definimos la variable suma.
        int resta;                                                              //Definimos la variable resta.
        int mult;                                                               //Definimos la variable mult.
        double div;                                                             //Definimos div como double en caso de que el resultado de dividir un número y otro no sea un entero.

        do {
            System.out.print("Introduzca el primer número: ");                              //Solicitamos el primer número.
            num1 = entrada.nextInt();
            System.out.print("Introduzca el segundo número: ");                             //Solicitamos el segundo número.
            num2 = entrada.nextInt();
            System.out.println("Por favor introduzca: \n1.Para sumar.\n2.Para restar.\n3.Para multiplicar.\n4.Para Dividir.\n5.Para salir del programa."); //Le decimos al usuario que tipo de operaciones puede realizar en función del número introducido.
            op = entrada.nextInt();

            if (op == 1) {                                                                  // Si el usuario elige el uno, sumamos los números introducidos.
                suma = num1 + num2;
                System.out.println("La suma es: " + suma);
            } else if (op == 2) {                                                            //Si el usuario elige el dos, restamos los números introducidos num1 y num2..
                resta = num1 - num2;
                System.out.println("La resta es: " + resta);

            } else if (op == 3) {                                                           //Si el usuario elige el tres, procedemos a multiplicar num1 y num2..
                mult = num1 * num2;
                System.out.println("La multiplicación es: " + mult);
            } else if (op == 4) {                                                           //Si el usuario escoge el cuatro, haremos una división de num1 y num2.
                div = num1 / num2;
                System.out.println("La división es: " + div);
            }

        } while (op != 5);

    }

}
