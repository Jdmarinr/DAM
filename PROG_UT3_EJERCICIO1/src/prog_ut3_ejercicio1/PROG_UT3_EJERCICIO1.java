
package prog_ut3_ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT3_EJERCICIO1 {

//Variables
    public static String n1= "";
    public static String n2= "";
    public static String n3= "";
    public static int[]nPrueba = new int[3];
    public static int[]nJuego = new int[3];
    public static int contIntentos=1;
    public static int contPartidas=0;
    public static int maxIntentos=0;
    public static int minIntentos=500;
    public static int maxPartida;
    public static int minPartida;
    public static int totalIntentos;
    public static String jugarOtra;
    public static String si = "Si";
    public static String no = "No";
    
    static public Scanner sc = new Scanner(System.in);
    
    //se crea un vector con 3 números aleatorios
    static void creadordeArray(){
       
        for (int i = 0 ; i < nJuego.length  ; i++) {
            nJuego[i]= (int) (Math.random()*10);
            //System.out.println(nJuego[i]);
        }
    }
    //pide que se introduzcan 3 números por teclado que se almacenan en un vector
    static void tuArray(){
       
        System.out.println("\nIntroduzca 3 números del 0 al 9: ");
        for(int i = 0; i < nPrueba.length ; i++) {
            nPrueba[i]= sc.nextInt();
            while(nPrueba[i]<0 || nPrueba[i]>9){ //si el número no está entre 0 y 9 vuelve a pedirlo
                System.out.println("El " + (i+1) + "º número no es válido, por favor introduzca uno nuevo.");
                nPrueba[i]=sc.nextInt();
            }
        }
        //System.out.println(nPrueba[0] +"\n"+nPrueba[1]+"\n"+nPrueba[2]);
    }
    //compara los valores de los dos arrays
    static void compararArrays(){
        //comparamos el valor en la posición 0 de tu vector con los 3 valores creados aleatoriamente
        if (nPrueba[0] != nJuego[0] && nPrueba[0] != nJuego[1] && nPrueba[0] != nJuego[2]){ //si el valor en la posición 0 de tu vector es diferente a todos los valores del vector aleatorio
            n1 = "Rojo";                                                                    //la pista es rojo
        } else if (nPrueba[0] != nJuego[0] && (nPrueba[0] == nJuego[1] || nPrueba[0] == nJuego[2])){ //si el valor en la posicion 0 de tu vector es igual que algún valor del vector aleatorio
            n1 = "Amarillo";                                                                         //que no esté en la posición 0 la pista es amarillo
        } else if (nPrueba[0] == nJuego[0]) { //si el valor en la posición 0 de tu vector es igual al valor de la posición 0 del vector aleatorio la pista es verde
            n1 = "Verde";
        }
        
        //comparamos el valor en la posición 1 de tu vector con los 3 valores creados aleatoriamente
        if (nPrueba[1] != nJuego[0] && nPrueba[1] != nJuego[1] && nPrueba[1] != nJuego[2]) {
            n2 = "Rojo";
        } else if (nPrueba[1] != nJuego[1] && (nPrueba[1] == nJuego[0] || nPrueba[1] == nJuego[2])) {
            n2 = "Amarillo";
        } else if (nPrueba[1] == nJuego[1]) {
            n2 = "Verde";
        }
        //comparamos el valor en la posición 2 de tu vector con los 3 valores creados aleatoriamente
        if (nPrueba[2] != nJuego[0] && nPrueba[2] != nJuego[1] && nPrueba[2] != nJuego[2]) {
            n3 = "Rojo";
        } else if (nPrueba[2] != nJuego[2] && (nPrueba[2] == nJuego[0] || nPrueba[2] == nJuego[1])) {
            n3 = "Amarillo";
        } else if (nPrueba[2] == nJuego[2]) {
            n3 = "Verde";
        }
        System.out.println(("Pista: " + n1 + ", " + n2 + ", " + n3 + "."));
    }
    //pregunta si quiere jugar otra partida
    public static void jugarOtra(){
        System.out.println("¿Desea jugar de nuevo [Si|No]?");
        jugarOtra = sc.next();
        while(jugarOtra.compareTo(si) != 0 && jugarOtra.compareTo(no) != 0){
            System.out.println("¿Desea jugar de nuevo [Sí|No]?");
            jugarOtra = sc.next();
        }
        if(jugarOtra.equals(si)){
            partida();
        }
    }
    //llama a todos los metodos necesarios en el orden correcto para jugar una partida
    public static void partida(){
        creadordeArray();
        tuArray();
        compararArrays();
        while(nPrueba[0] != nJuego [0] || nPrueba[1] != nJuego [1] || nPrueba[2] != nJuego [2] ){
            tuArray();
            compararArrays();
            contIntentos++;
        } 
        contPartidas++;
        if(contIntentos < minIntentos){
            minIntentos = contIntentos;
            minPartida = contPartidas;
        }
        if(contIntentos > maxIntentos){
            maxIntentos = contIntentos;
            maxPartida = contPartidas;
        }
        totalIntentos = totalIntentos + contIntentos;
        
        System.out.println("\n¡Has adivinado los tres números en " + contIntentos + " intentos!");
        System.out.println("\nEstadísticas.\n");
        System.out.println("---------------------------------------------------------");
        System.out.println("\nMedia: " + totalIntentos/contPartidas + " intentos.");
        System.out.println("Máximo intentos: " + maxIntentos + " en la partida " + maxPartida + ".");
        System.out.println("Mínimo intentos: " + minIntentos + " en la partida " + minPartida + ".\n");
        contIntentos = 0;
        
        jugarOtra();
    }
    public static void main(String[] args) {
        partida();
    }  
}
