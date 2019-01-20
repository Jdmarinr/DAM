/*
Marín Rodríguez, Juan David.
Realiza un programa que te indique la suma total de los números pares existentes entre el 1 y el 100 y la suma total de los números ompares existentes entre el 1 y el 100.
 */
package problema1a;

/**
 *
 * @author Juan David
 */
public class Problema1A {

    public static void main(String[] args) {
        int sumaP = 0;                //Definimos la variable para hacer la suma de los números pares, inicialmente vale cero.
        int sumaImp = 0;              //Definimos la variable para hacer la suma de los números impares, inicialmente vale cero.

        for (int i = 1; i <= 100; i++) {    //Hacemos un bucle for con la condición de que la variable i inicie en 1 y llegue hasta 100.
            if (i % 2 == 0) {                   //En caso de que el resto de i al divirse por 2 sea cero se sumará i.
                sumaP += i;
            } else {                           //En el caso contrario entonces será un número impar y se sumará i a la variable sumaImp.
                sumaImp += i;
            }
        }
        System.out.println("La suma de los números pares es: " + sumaP + "\nLa suma de los números impares es: " + sumaImp); //Imprimimos el resultado con la suma total de números pares e impares.

    }

}
