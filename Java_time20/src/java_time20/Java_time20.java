/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_time20;

import java.time.Duration;
import static java.time.Duration.between;
import java.time.LocalTime;

/**
 *
 * @author Aritz y Juan David
 */
public class Java_time20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tiempoAbierto();
        tiempoCierre();
    }

    public static void tiempoAbierto() {
        Duration tiempo = between(LocalTime.parse("08:00:00"), LocalTime.now());
        Duration tiempoTotalAbierto = between(LocalTime.parse("08:00:00"), LocalTime.parse("21:20:00"));
        String abierto = tiempo.toHours() + " horas " + (tiempo.toMinutes() - (tiempo.toHours() * 60) + " minutos.");
        if (tiempo.toMinutes() < 0) {
            System.out.println("El instituto no ha abierto todavía.");
        } else if (tiempo.toMinutes() > tiempoTotalAbierto.toMinutes()) {
            System.out.println("El instituto ya ha cerrado.");
        } else {
            System.out.println("El instituto lleva abierto: " + abierto);
        }
    }

    public static void tiempoCierre() {
        Duration tiempoParaCierre = between(LocalTime.now(), LocalTime.parse("21:20:00"));
        Duration tiempoTotalAbierto = between(LocalTime.parse("08:00:00"), LocalTime.now());
        String cierre = tiempoParaCierre.toHours() + " horas " + (tiempoParaCierre.toMinutes() - (tiempoParaCierre.toHours() * 60) + " minutos.");
        if (tiempoParaCierre.toMinutes() < 0) {
            System.out.println("El instituto ya ha cerrado.");
        } else if (tiempoTotalAbierto.toMinutes() < 0) {
            System.out.println("El instituto no ha abierto todavía.");
        } else {
            System.out.println("El instituto cerrará en: " + cierre);
        }
    }
}
