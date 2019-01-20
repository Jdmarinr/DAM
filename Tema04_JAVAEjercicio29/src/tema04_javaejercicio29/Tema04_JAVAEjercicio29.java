/*
Ejercicio 29: Escribe un programa que contenga un método donde le pidamos al usuario
su nombre, otro método donde le pidamos su edad y otro método llamado mayorDeEdad, que reciba la edad 
como entero por parámetro y muestre un mensaje por pantalla de si el usuario llamado XXX es mayor  de 
edad o no.
 */
package tema04_javaejercicio29;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema04_JAVAEjercicio29 {
    static Scanner scr = new Scanner(System.in);
    static String nombre;
    static int edad;
    
   
    public static String getNombre() {
        System.out.println("Introduzca su nombre: ");
        nombre = scr.next();
        return nombre;
    }

    public static int getEdad() {
        System.out.println("Introduzca su edad: ");
        edad = scr.nextInt();
        return edad;
    }
    
    public static void MayorDeEdad ()
    {
        
        if (edad>=18) {
            System.out.println("El usuario "+nombre+" es mayor de edad.");
        }
        else {
            System.out.println("El usuario "+nombre+" es menor de edad.");
        }
    }
    
    public static void main(String[] args) {
        getNombre();
        getEdad();
        MayorDeEdad();
    }
    
}
