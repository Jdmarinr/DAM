/*Pide una contraseña al usuario. Si la escribe bien le dará la enhorabuena, 
pero si la escribe mal 3 veces le dara un mensaje de error de acceso.*/
package ejercicio18_prueba;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio18_prueba {

    static Scanner sc = new Scanner(System.in);
    static String contraseña = "PepeTorero96";
    static String contra;
    static int cont = 0;

    public static void contraseña() {

        do {
            System.out.println("Introduzca la contraseña:");
            contra = sc.next();
            cont++;
        } while (!contra.equals(contraseña) && cont != 3);
        if(cont == 3){
            System.out.println("Error de acceso.");
        }
        else{
            System.out.println("ENHORABUENA BRO, LA CONTRASEÑA ES WENA");
        }

    }

    public static void main(String[] args) {
        contraseña();
    }

}
