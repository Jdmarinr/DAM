/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_time19;

import java.time.LocalDate;
import static java.time.Period.between;
import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Java_time19 {

    static Scanner sc = new Scanner(System.in);
    static int edad;
    static LocalDate fechaExp;

    public static void main(String[] args) {
        pedirEdad();
        fechaExpedicion();
        fechaRenovacion();
    }

    public static void pedirEdad() {
        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();
    }

    public static void fechaExpedicion() {
        System.out.println("Introduzca la fecha de expedición de su DNI en formato AAAA-MM-DD: ");
        fechaExp = LocalDate.parse(sc.next());
    }

    public static void fechaRenovacion() {
        if (edad <= 5) {
            System.out.println("La fecha de renovación de su DNI es: " + fechaExp.plusYears(2));
        } else if ((edad - (between(fechaExp, LocalDate.now())).getYears()) < 30) {
            System.out.println("La fecha de renovación de su DNI es: " + fechaExp.plusYears(5));
        } else if (edad < 70) {
            System.out.println("La fecha de renovación de su DNI es: " + fechaExp.plusYears(10));
        } else {
            System.out.println("Su DNI es permanente.");
        }
    }
}
