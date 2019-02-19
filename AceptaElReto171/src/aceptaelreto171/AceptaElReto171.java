package aceptaelreto171;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class AceptaElReto171 {

    public static Scanner sc = new Scanner(System.in);

    public static void abadias() {
        int casos = -1;
        int[] montañas, numAbadias;
        int cont = 1;
        int cont2 = 1;
        int auxiliar = 1;
        boolean aux = true;

        while (casos != 0) {
            System.out.println("Introduzca el número de montañas:");
            casos = sc.nextInt();
            
            while (casos < 0 || casos > 100000) {
                System.out.println("Introduzca el número de montañas:");
                casos = sc.nextInt();
            }
            if (casos != 0) {
                montañas = new int[casos];
                System.out.println("Introduzca la altura de las montañas:");

                for (int i = 0; i < montañas.length; i++) {
                    montañas[i] = sc.nextInt();
                }
                for (int i = 0; i < montañas.length - 1; i++) {
                    for (int j = auxiliar; j < montañas.length; j++) {
                        while (aux == true && cont2 != casos) {
                            if (montañas[i] <= montañas[j]) {
                                aux = false;
                            }
                            cont2++;
                        }
                    }
                    if (aux == true) {
                        cont++;
                    }
                    auxiliar++;
                    aux = true;
                    cont2 = 1;
                }
                System.out.println("Se pueden construir " + cont + " abadías.");
                auxiliar = 1;
                cont = 1;
            }
        }
    }

    public static void main(String[] args) {
        abadias();
    }

}
