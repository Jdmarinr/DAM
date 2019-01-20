/*
Marín Rodríguez, Juan David
 */
package problema_1;

import java.util.Scanner;

public class Problema_1 {

    static Scanner scr = new Scanner(System.in);
    static int num1, num2;
    public static int c;

    public static void menu() {                                                     //Creamos el método que ofrece el menú al usuario
        System.out.println("1. Sumar números.\n2. Restar números.\n3. Multiplicar números.\n4. Potencia de un número.\n5. Dividir números.\n6.- Salir del programa.");
    }

    public static void escoger() {

        System.out.println("Introduzca el número que corresponda con la opción del menú:");
        c = scr.nextInt();

        while (c != 1 && c != 2 && c != 3 && c != 4 && c != 5 && c != 6) {                  //Condicionamos la opción a que sea una correcta.
            System.out.println("Error: introduzca nuevamente el número a elegir de una opción del menú:");
            c = scr.nextInt();
        }

        if (c != 6) {
            //Si el número no es un 6 entra en el switch.
            switch (c) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    potencia();
                    break;
                case 5:
                    division();
                    break;
                case 6:
                    break;
            }
          
            menu();                                                             //Repetimos nuevamente llamando a los métodos
            escoger();
        }
    }

    public static void pedimosNumeros() {
        System.out.println("Introduzca el primer número: ");
        num1 = scr.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = scr.nextInt();
    }
    

    public static void suma() {
        pedimosNumeros();
        System.out.println("La suma es " + (num1 + num2));
    }

    public static void resta() {
        pedimosNumeros();
        System.out.println("La resta es " + (num1 - num2));
    }

    public static void multiplicacion() {
        pedimosNumeros();
        System.out.println("El resultado de la multiplicación es " + (num1 * num2));
    }

    public static void division() {
        pedimosNumeros();
        System.out.println("El resultado de la división es " + (num1 / num2));
    }

    public static void potencia() {
        pedimosNumeros();
        System.out.println("El resultado de la potencia es " + ((int) Math.pow(num1, num2)));
    }
   
    
public static void main(String[] args) {
        menu();
        escoger();
    }
}
