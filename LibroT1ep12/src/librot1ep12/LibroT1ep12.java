
package librot1ep12;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam
 */
public class LibroT1ep12 {

    public static void main(String[] args) {
        int b500=0;                                                     //definimos un entero inicializado a 0 por cada tipo de billete existente.
        int b200=0;
        int b100=0;
        int b50=0;
        int b20=0;
        int b10=0;
        int b5=0;
       
        System.out.println("Introduzca el importe a convertir: ");
        
        Scanner entrada = new Scanner(System.in);                       //pide introducir un entero por teclado que guardamos en a
        int a = entrada.nextInt();
        int b = a;                                                      //guarda el valor introducido en la variable b para actuar con ella y dejar a intacta

        if(b>=500){                                                     //si el valor introducido es mayor que 500 
            b500 = b/500;                                               //divide el valor que hay en b por 500 para que devuelva el numero de billetes de 500 
            b %= 500;                                                   //actualizamos b con lo que ha sobrado (el resto de la división de la linea anterior)
        }
        if(b>=200){
            b200 = b/200;
            b %= 200;
        }
        if(b>=100){
            b100 = b/100;
            b%= 100;
        }
        if(b>=50){
            b50 = b/50;
            b%= 50;
        }
        if(b>=20){
            b20 = b/20;
            b%= 20;
        }
        if(b>=10){
            b10 = b/10;
            b%= 10;
        }
        if(b>=5){
            b5 = b/5;
            b%= 5;
        }
                 
        System.out.println(a+" euro(s):\n"+b500+" billete(s) de 500.\n"+b200+" billete(s) de 200.\n"+b100+" billete(s) de 100.\n"+b50+" billete(s) de 50.\n"+b20+" billete(s) de 20.\n"+b10+" billete(s) de 10.\n"+b5+" billete(s) de 5.\nSobran "+b+" euro(s).");
    }       
}
    
