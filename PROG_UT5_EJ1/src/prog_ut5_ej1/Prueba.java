package prog_ut5_ej1;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double saldo;
        Cuenta cuenta1 = new Cuenta(50);
        Cuenta cuenta2 = new Cuenta();

        System.out.println("El saldo de la primera cuenta es: " + cuenta1.obtenerSaldo() + "€");
        System.out.println("\nEl saldo de la segunda cuenta es: " + cuenta2.obtenerSaldo() + "€");

        System.out.println("\nIngrese dinero en la primera cuenta: ");
        saldo = scr.nextDouble();
        while (saldo <= 0) {
            System.out.println("El ingreso ha de ser positivo.");
            System.out.println("Ingrese dinero en la primera cuenta: ");
            saldo = scr.nextDouble();
        }
        cuenta1.abonar(saldo);

        System.out.println("\nIngrese dinero en la segunda cuenta: ");
        saldo = scr.nextDouble();
        while (saldo <= 0) {
            System.out.println("El ingreso ha de ser positivo.");
            System.out.println("Ingrese dinero en la primera cuenta: ");
            saldo = scr.nextDouble();
        }
        cuenta2.abonar(saldo);

        System.out.println("\nEl saldo de la primera cuenta es: " + cuenta1.obtenerSaldo() + "€");
        System.out.println("\nEl saldo de la segunda cuenta es: " + cuenta2.obtenerSaldo() + "€");

    }

}
