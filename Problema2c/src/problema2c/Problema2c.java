//Diez Maseda, Aritz
package problema2c;

import java.util.Scanner;

public class Problema2c {

    //variables que son utiliozadas por más de un metodo
    static Scanner sc = new Scanner(System.in);
    static String a;

    //metodo que pide al usuario que introduzca una cadena de caracteres
    public static void entrada() {
        System.out.println("Introduzca una cadena de caracteres: ");
        a = sc.next();  //la cadena introducida se guarda en el String a
    }

    //metodo que cambia todas las 'e' de la cadena introducida por 'u' y muestra por pantalla la cadena ya cambiada
    public static void ePorU(){
        //se guarda en el String b la cadena introducida por el usuario cambiando las 'e' por 'u'
        String b = a.replace('e', 'u');     //a.replace('e', 'u') lo que hace es cambiar todas las 'e' del String a por 'u'
        System.out.println(b);  //muestra b por pantalla
    }

    public static void main(String[] args) {
        //llama a los metodos entrada() y ePorU()
        entrada();
        ePorU();
    }
}
