/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_time18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import static java.time.Period.between;
import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Java_time18 {

    static Scanner sc = new Scanner(System.in);
    static int año, mes, dia;

    public static void main(String[] args) {
        pedirFecha();
        menu();
        eleccion();
    }

    public static void edadExacta(int _anyo, int _mes, int _dia) {
        LocalDate nacimiento = LocalDate.of(_anyo, _mes, _dia);
        System.out.println(nacimiento);
        System.out.println("Su edad es: " + between(nacimiento, LocalDate.now()));
    }

    public static void diaDeSemana(int _anyo, int _mes, int _dia) {
        LocalDate nacimiento = LocalDate.of(_anyo, _mes, _dia);
        System.out.println("Nació un: " + nacimiento.getDayOfWeek());
    }

    public static void estacion(int _anyo, int _mes, int _dia) {
        LocalDate nacimiento = LocalDate.of(_anyo, _mes, _dia);
        String aux = "";
        switch (nacimiento.getMonthValue()) {
            case 12:
            case 1:
            case 2:
                aux = "invierno";
                break;
            case 3:
            case 4:
            case 5:
                aux = "primavera";
                break;
            case 6:
            case 7:
            case 8:
                aux = "verano";
                break;
            case 9:
            case 10:
            case 11:
                aux = "otoño";
                break;
        }
        System.out.println("La estación era: " + aux);
    }

    public static void diasVividos(int _anyo, int _mes, int _dia) {
        LocalDate nacimiento = LocalDate.of(_anyo, _mes, _dia);
        long nDias = ChronoUnit.DAYS.between(nacimiento, LocalDate.now());
        System.out.println("Ha vivido: " + nDias + " días");
    }

    public static void mayorDeEdad(int _anyo, int _mes, int _dia) {
        LocalDate nacimiento = LocalDate.of(_anyo, _mes, _dia);
        if (nacimiento.plusYears(18).getYear() > LocalDate.now().getYear()) {
            System.out.println("Podrás conducir en el año: " + nacimiento.plusYears(18).getYear());
        } else {
            System.out.println("Puedes conducir desde el año: " + nacimiento.plusYears(18).getYear());
        }
    }

    public static void pedirFecha() {
        System.out.println("Introduzca el año de su nacimiento: ");
        año = sc.nextInt();
        while (año < 0 || año > LocalDate.now().getYear()) {
            System.out.println("Su año de nacimiento debe estar entre el año 0 y el actual.\nIntrodúzcalo de nuevo.");
            año = sc.nextInt();
        }
        System.out.println("Introduzca el número del mes de su nacimiento: ");
        mes = sc.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Su mes de nacimiento debe estar entre el 1 y el 12.\nIntrodúzcalo de nuevo.");
            mes = sc.nextInt();
        }
        System.out.println("Introduzca el dia de su nacimiento: ");
        dia = sc.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.println("El día del mes no puede ser menor que 1 ni mayor que 31.\nIntrodúzcalo de nuevo.");
            dia = sc.nextInt();
        }
        switch (mes) {
            case 2:
                if (dia > 28) {
                    System.out.println("El día no puede ser mayor de 28. Introdúzcalo de nuevo.");
                    dia = sc.nextInt();
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30) {
                    System.out.println("El día no puede ser mayor de 30. Introdúzcalo de nuevo.");
                    dia = sc.nextInt();
                }
                break;

        }
    }

    public static void menu() {
        System.out.println("\n1. Te calcula tu edad exacta en años, meses y días.\n2. Te dice en qué día de la semana naciste.\n3. Te dice qué estación del año era.\n4. Te dice cuántos días llevas vividos.\n5. Te dice qué año podrás o pudiste conducir.");
    }

    public static void eleccion() {
        int aux = sc.nextInt();
        switch (aux) {
            case 1:
                edadExacta(año, mes, dia);
                break;
            case 2:
                diaDeSemana(año, mes, dia);
                break;
            case 3:
                estacion(año, mes, dia);
                break;
            case 4:
                diasVividos(año, mes, dia);
                break;
            case 5:
                mayorDeEdad(año, mes, dia);
                break;
            default:
                throw new AssertionError();
        }
    }
}
