package aceptaelreto157;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class AceptaElReto157 {

    public static void main(String[] args) {
        
        System.out.println("Introduzca el número de casos:");
        Scanner sc1 = new Scanner(System.in);
        int nCasos = sc1.nextInt();
        while (nCasos > 0){
            System.out.println("Introduzca el día y el mes:");
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            int m = sc.nextInt();
            int diasRest = 365;
            if ((d<=0 || d >31) || (m <= 0 || m>12) || (d > 28 && (m == 2)) || 
                    (d > 30 && (m == 4 || m == 6 || m == 9 || m == 11)) || 
                    (d > 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12))){
                System.out.println("Este caso no es válido, le quedan "+(nCasos-1)+" casos.");
            }
            else{
                for(int i=1;i<m;i++){
                    if(i==2){
                        diasRest -= 28;
                    }else if (i==4||i==6||i==9||i==11){
                        diasRest -= 30;
                    }else {
                        diasRest -= 31;
                    }  
                }
                diasRest -= d;
                System.out.println("Los días restantes son " + diasRest);
                
            }
            nCasos--;
        }
    }
}
