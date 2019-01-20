/*
Marín Rodríguez, Juan David.
 */
package problema_3b;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Problema_3b {

    public static int a = 1000;                                                             //Damos un rango al array de 1000
    public static char[] array = new char[a];
    public static char[] b;

    public static void aleator() {                                                           //Creamos el primer método con un array de carácteres aleatorios

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (Math.random() * 26 + 97);                                    //Guardamos en el array los carácteres aleatorios y hacemos el cambio para que sólo recoja carácteres dentro del alfabeto
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);                                                       //Muestra los valores por pantalla
        }
    }

    public static void suNombre() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");
        String nombre = scr.next();                                                 //Se guarda el nombre
        b = nombre.toCharArray();                                                   //convierte el String en un array de caracteres y lo guardamos en la otra variable

    }

   
    public static void busqueda() {                                              //método de búsqueda del nombre

        suNombre();                                                             //Llamamos al método  
        int contador = 0;                                                       //se inicializa un contador a 0
        boolean aux[] = new boolean[b.length];                                          //se crea un array de booleanos con la longitud del array que guarda el nombre

        for (int i = 0; i < b.length; i++) {    
            for (int j = 0; j < array.length; j++) {   //Recorre el array aleatorio
                if (b[i] == array[j]) {   
                    aux[i] = true;      //Guarda true en la posicion i del array de booleanos
                }
            }
        }
        for (int i = 0; i < aux.length; i++) {                                  //Recorremos el array auxiliar
            if (aux[i] == true) {                                                  
                    contador++;                                                    
            }
        }
        if (contador == aux.length) {                                   //si el valor del contador es igual a la longitud del array aux
            System.out.println("Encontrado.");                                  //En caso de que el array contenga las letras para formar mi nombre
        } else {                                                         //En caso de que no sea igual, no contiene todas, por ello, no encontrado.
            System.out.println("No encontrado.");   
        }
    }

    public static void main(String[] args) {
        aleator();
        busqueda();
    }
}
