//Diez Maseda, Aritz
package problema2b;

import java.util.Scanner;

public class Problema2b {

    //variables que son utilizadas por más de un metodo
    static Scanner sc = new Scanner(System.in);
    static String a;
    static String b;

    //metodo que pide al usuario que introduzca dos cadenas de caracteres
    public static void entrada() {
        System.out.println("Introduzca la primera cadena de caracteres: ");
        a = sc.next();  //guarda la primera cadena en el String a
        System.out.println("Introduzca la segunda cadena de caracteres: ");
        b = sc.next();  //guarda la segunda cadena en el String b
    }

    //metodo que compara las dos cadenas sin tener en cuenta las mayúsculas
    public static void comparaCadenas() {
        //si la cadena a es igual que la cadena b sin tener en cuenta las mayúsculas
        if (a.equalsIgnoreCase(b)) {
            //muestra por pantalla que las cadenas son iguales
            System.out.println("Las cadenas son iguales.");
        } else {    //si no son iguales muestra por pantalla que son distintas
            System.out.println("Las cadenas son distintas.");
        }
    }

    public static void main(String[] args) {
        entrada();
        comparaCadenas();
    }
}
