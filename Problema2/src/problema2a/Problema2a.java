//Diez Maseda, Aritz
package problema2a;

import java.util.Scanner;

public class Problema2a {

    //variables que van a ser utilizadas por más de un método
    static Scanner sc = new Scanner(System.in);
    static char[] nombre;

    //metodo que pide al usuario que introduzca una cadena de caracteres
    public static void entrada() {
        System.out.println("Introduzca una cadena de caracteres: ");
        String a = sc.next();   //se guarda en a la cadena de caracteres introducida por teclado por el usuario
        nombre = a.toCharArray();   //la cadena a se transforma en un array de caracteres y se guarda en el array nombre
    }
    
    //metodo que compara la cadena introducida por teclado por el usuario, en forma de array de caracteres, con las vocales y muestra por pantalla el número de vocales que hay en la cadena
    public static void vocales() {
        //se crea un array o vector de caracteres para guardar las vocales
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int cont = 0;   //se crea e inicializa un contador a 0 
        
        //si el valor en la posicion i del array nombre es igual a cualquiera de las vocales del array vocales, suma 1 al contador cont
        for (int i = 0; i < nombre.length; i++) {   //un bucle for que recorre todo el array de caracteres que contiene la cadena introducida por teclado por el usuario
            for (int j = 0; j < vocales.length; j++) {  //un bucle for que recorre todo el array vocales
                if (nombre[i] == vocales[j]) {      //si el caracter en la posicion i del array nombre es igual que el caracter en la posicion j del array vocales suma 1 al contador
                    cont++;
                }
            }
        }
        //muestra por pantalla el número de vocales que hay en la cadena introducida por el usuario
        System.out.println("La cadena introducida tiene " + cont + " vocales.");
    }

    public static void main(String[] args) {
        //llama a los metodos entrada() y vocales()
        entrada();
        vocales();
    }
}
