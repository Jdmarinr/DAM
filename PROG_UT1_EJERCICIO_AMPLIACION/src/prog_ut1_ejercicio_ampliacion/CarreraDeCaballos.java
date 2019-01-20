package prog_ut1_ejercicio_ampliacion;

import java.util.Scanner;

/**
 *
 * @author elmierdasdeAritz y Juan David
 */
public class CarreraDeCaballos {
    
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int l;
    static int eleccion;
    static int cEtapa = 1;
    static int disC1 = 0;
    static int disC2 = 0;
    
    //metodo que calcula el avance de los caballos, lo vuelve a calcular si el avance de alguno de los caballos es menor que 1
    //y una vez los dos son mayores que 0 suma el avance de cada caballo a su distancia.
    public static void avanceCaballos(){
        int avC1 = 0;
        int avC2 = 0;
        
        while(avC1 < 1 || avC2 < 1){
            if(avC1 < 1 && avC2 < 1){
                avC1 = (int) (Math.random()*11 - n*0.1);
                avC2 = (int) (Math.random()*11 - n*0.1);
            }
            else if(avC1 < 1){
                avC1 = (int) (Math.random()*11 - n*0.1);
            }
            else{
                avC2 = (int) (Math.random()*11 - n*0.1);
            }
        }
        disC1 = disC1 + avC1;
        disC2 = disC2 + avC2;
    }
    
    public static void carreras() {
        //se pide que introduzca el número de carreras que quiere jugar
        boolean aux = false;
        while (aux == false){
            System.out.println("Introduzca el número de carreras que desea jugar, el mínimo de carreras son 2:");
            n = sc.nextInt();
            if (n >= 2){
                aux = true;
            }
        }
        //se pide que introduzca la longitud de pista que quiere
        aux = false;
        while (aux == false){
            System.out.println("Introduzca la longitud de la pista, debe estar entre 200m y 800m:");
            l = sc.nextInt();
            if (l >= 200 && l <=800){
                aux = true;
            }
        }
        
        //indicamos qué carrera es y entramos en ella
        for (int i = 1; i <= n; i++) {
            System.out.println("******************* INICIANDO EL JUEGO NUMERO " + n + " *******************");
            //indicamos qué caballo quiere
            aux = false;
            while (aux == false){
                System.out.println("¿Qué caballo quiere: el 1 o el 2?");    
                eleccion = sc.nextInt();
                if(eleccion == 1 || eleccion == 2){
                    aux = true;
                }
            }
            if(eleccion == 1){
                System.out.println("Jugador 1 apuesta al caballo 1, Jugador 2 apuesta al caballo 2");
            }else{
                System.out.println("Jugador 1 apuesta al caballo 2, Jugador 2 apuesta al caballo 1");
            }
            //hacemos avanzar los dos caballos mientras su avance guardado no sea mayor o igual a la longitud de la pista
            while (disC1 < l && disC2 < l) {
                avanceCaballos();
                System.out.println("**** Etapa " +cEtapa+ "****");
                System.out.println("El caballo 1 se encuentra en la posicion: " + disC1);
                System.out.println("El caballo 2 se encuentra en la posicion: " + disC2);
                cEtapa++;
            }
            //mostramos por pantalla el ganador
            
            //si ha ganado el caballo 1
            if(disC1 >= l && disC2 < l){
                //y si el jugador 1 ha elegido el caballo 1
                if(eleccion == 1){
                    System.out.println("Ha ganado el caballo 1, por tanto el ganador es el jugador 1.");
                }
                //y si el jugador 1 ha elegido el caballo 2
                else {
                    System.out.println("Ha ganado el caballo 1, por tanto el ganador es el jugador 2.");  
                }
            }
            //si ha ganado el caballo 2
            else if (disC1 < l && disC2 >= l) {
                //y si el jugador 1 ha elegido el caballo 1
                if(eleccion == 1){
                    System.out.println("Ha ganado el caballo 2, por tanto el ganador es el jugador 2.");
                }
                //y si el jugador 1 ha elegido el caballo 2
                else {
                    System.out.println("Ha ganado el caballo 2, por tanto el ganador es el jugador 1.");
                }
            }
            //si han empatado los dos caballos
            else {
                System.out.println("Han empatado los caballo, por tanto no ha ganado ninguno.");
            } 
            disC1 = 0;
            disC2 = 0; 
        }
    }

    public static void main(String[] args) {
        carreras();
    }
    
}
