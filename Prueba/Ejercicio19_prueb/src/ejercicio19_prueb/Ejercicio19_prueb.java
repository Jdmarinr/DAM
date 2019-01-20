/*
 Crear un for que vaya del 1 al 10, y sin recurrir al break hacer que se detenga en 5.
 */
package ejercicio19_prueb;

/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio19_prueb {

    public static void main(String[] args) {
        for (int i=1; i<=10; i++){ //Hacemos un bucle que vaya del 1 al 10
            System.out.println(i);
              if (i==5){
                  i=10; // damos a i==5 el valor de 10, así corta la progresión y no llega hasta 10.    
            }        
       }
    }
    
}
