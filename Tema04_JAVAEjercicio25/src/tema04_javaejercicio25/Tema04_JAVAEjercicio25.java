package tema04_javaejercicio25;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema04_JAVAEjercicio25 {

    //Variables
    static int nIni, nFin, sumaTotal;
    static Scanner sc = new Scanner(System.in);

    public static void numInicial() {
        System.out.println("Introduzca el número inicial:");
        nIni = sc.nextInt();
    }

    public static void numFinal() {
        System.out.println("Introduzca el número final:");
        nFin = sc.nextInt();
        while (nFin <= nIni) {
            System.out.println("El número introducido es menor o igual que el número inicial.\nIntroduzca el número final:");
            nFin = sc.nextInt();
        }
    }

    public static int sumaPares() {
        numInicial();
        numFinal();
        for (int i = nIni; i <= nFin; i++) {
            if (i % 2 == 0) {
                sumaTotal = sumaTotal + i;
            }
        }
        return sumaTotal;
    }

    public static void main(String[] args) {
        System.out.println(sumaPares());
    }

}
