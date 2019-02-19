/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_time21;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Java_time21 {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        zodiaco(pedirFecha());
    }
    
    public static LocalDate pedirFecha(){
        System.out.println("Introduzca su fecha de nacimiento en formato AAAA-MM-DD: ");
        LocalDate nacimiento = LocalDate.parse(sc.next());
        return nacimiento;
    }
    
    public static void zodiaco(LocalDate _nacimiento){
        switch (_nacimiento.getMonthValue()) {
            case 1:
                if(_nacimiento.getDayOfMonth() <= 20){
                    System.out.println("Su signo del zodiaco es Capricornio.");
                }else{
                    System.out.println("Su signo del zodiaco es Acuario.");
                }
                break;
            case 2:
                if(_nacimiento.getDayOfMonth() <= 19){
                    System.out.println("Su signo del zodiaco es Acuario.");
                }else{
                    System.out.println("Su signo del zodiaco es Piscis.");
                }
                break;
            case 3:
                if(_nacimiento.getDayOfMonth() <= 20){
                    System.out.println("Su signo del zodiaco es Piscis.");
                }else{
                    System.out.println("Su signo del zodiaco es Aries.");
                }
                break;
            case 4:
                if(_nacimiento.getDayOfMonth() <= 20){
                    System.out.println("Su signo del zodiaco es Aries.");
                }else{
                    System.out.println("Su signo del zodiaco es Tauro.");
                }
                break;
            case 5: 
                if(_nacimiento.getDayOfMonth() <= 21){
                    System.out.println("Su signo del zodiaco es Tauro.");
                }else{
                    System.out.println("Su signo del zodiaco es Géminis.");
                }
                break;
            case 6: 
                if(_nacimiento.getDayOfMonth() <= 21){
                    System.out.println("Su signo del zodiaco es Géminis.");
                }else{
                    System.out.println("Su signo del zodiaco es Cáncer.");
                }
                break;
            case 7:
                if(_nacimiento.getDayOfMonth() <= 22){
                    System.out.println("Su signo del zodiaco es Cáncer.");
                }else{
                    System.out.println("Su signo del zodiaco es Leo.");
                }
                break;
            case 8: 
                if(_nacimiento.getDayOfMonth() <= 22){
                    System.out.println("Su signo del zodiaco es Leo.");
                }else{
                    System.out.println("Su signo del zodiaco es Virgo.");
                }
                break;
            case 9:
                if(_nacimiento.getDayOfMonth() <= 22){
                    System.out.println("Su signo del zodiaco es Virgo.");
                }else{
                    System.out.println("Su signo del zodiaco es Libra.");
                }
                break;
            case 10: 
                if(_nacimiento.getDayOfMonth() <= 22){
                    System.out.println("Su signo del zodiaco es Libra.");
                }else{
                    System.out.println("Su signo del zodiaco es Escorpio.");
                }
                break;
            case 11:
                if(_nacimiento.getDayOfMonth() <= 22){
                    System.out.println("Su signo del zodiaco es Escorpio.");
                }else{
                    System.out.println("Su signo del zodiaco es Sagitario.");
                }
                break;
            case 12:
                if(_nacimiento.getDayOfMonth() <= 21){
                    System.out.println("Su signo del zodiaco es Sagitario.");
                }else{
                    System.out.println("Su signo del zodiaco es Capricornio.");
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
