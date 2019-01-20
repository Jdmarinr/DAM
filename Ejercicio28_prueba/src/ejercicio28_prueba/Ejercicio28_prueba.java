/*
Realiza un programa que genere un número alatorio (utiliza Math.random()) entre 1 y 100,
que lo muestre por pantalla e indique si es par o impar.
 */
package ejercicio28_prueba;
/**
 *
 * @author Aritz y Juan David
 */
public class Ejercicio28_prueba {

    public static void main(String[] args) {
        int num;
        double alea;
        int x;
        
        num = (int)(Math.random()*100+1);
        alea = Math.floor(num);
        x = (int)alea;
        
        
        System.out.println(x);
            if (num%2==0){
                System.out.println("Este número es par");
            }
            else{
                System.out.println("Este número es impar");
            }
    }
    
}
