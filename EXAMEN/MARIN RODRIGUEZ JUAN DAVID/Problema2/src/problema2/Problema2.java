/*
Marín Rodríguez, Juan David.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Juan David
 */
public class Problema2 {

    public static void main(String[] args) {
        int num;                                                                //Establecemos la variable num, que será el número que introducirá el usuario.
        int n;                                                                  //Establecemos n, que será la variable que obtendremos a través del método Math.random.
        int cont = 1;                                                             //Establecemos una variable que servirá de contador de los intentos que se introducirán.

        Scanner entrada = new Scanner(System.in);                               //Utilizamos el método scanner para leer el número del usuario.

        System.out.println("Introduzca un número para adivinar: ");             //Pedimos el número al usuario
        num = entrada.nextInt();
        n = (int) (Math.random() * 100 + 1);                                         //Hacemos la asignación de un número aleatorio a la variable a través de Math.random.

        while (n != num) {                                                        //Iniciamos un bucle con la condición de que se ejecute mientras que el número del usuario (num) y el número aleatorio (n) no coincidan.
            if (n > num) {
                System.out.println("El número que tiene que adivinar es mayor");                               //Si el número a adivinar es mayor se le dirá al usuario.
            } else {
                System.out.println("El número que tiene que adivinar es menor");                                //Le decimos al usuario que el número a adivinar es menor que el que ha introducido.
            }
            cont++;                                                                                             //Sumamos un intento mediante el contador.
            System.out.println("Introduzca un número: ");
            num = entrada.nextInt();                                                                            //Pedimos nuevamente un número al usuario, y así sucesivamente hasta que adivine.
        }

        System.out.println("Enhorabuena, has acertado, es el número " + n + ".");                           //Le decimos al usuario el número que ha adivinado.
        System.out.println("Has necesitado " + cont + " intentos. ");                                       //Igualmente, decimos el número de veces que se ha intentado adivinar.

    }

}
