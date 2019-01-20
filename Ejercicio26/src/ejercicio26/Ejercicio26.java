//Es programa que te dica la suma total de los números impares existentes entre el 111 y el 222
package ejercicio26;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio26 {
    //Es programa que te dica la suma total de los números impares existentes entre el 111 y el 222
    static int sumaTotal = 0;       //declaramos la suma total inicializada en 0
    
    public static void sumaImpares(){
        for (int i = 111; i < 222; i = i + 2) {     //un bucle que va desde 111 hasta 222 de 2 en 2, entonces i siempre es impar
            sumaTotal = sumaTotal+i;                //actualizamos el valor de sumaTotal sumándole el i en cada iteración del bucle
            //System.out.println(sumaTotal);
        }
        System.out.println(sumaTotal);
    }
    public static void main(String[] args) {
        sumaImpares();      //llamamos al metodo que contiene el programa
    }  
}
