
package librot1ep8;

/**
 *
 * @author dam
 */
public class LibroT1ep8 {


    public static char devuelveletras() {
        return (char)(Math.random()*26 + 97);
   }
    public static void main(String[] args) {
        char a = devuelveletras();
        /*char[] v = {'a', 'e', 'i', 'o', 'u'};                             //aquí dentro de un bucle for se compara la letra con un  
        boolean cond = false;                                               //array de vocales utilizando una condición booleana para 
        for (int i=0; i<=4; i++){                                           //guardar si es una vocal o no
            if(a==v[i]){
                cond = true;
            }
        }
        if (cond == true){
            System.out.println("La letra " + a + " es una vocal.");
        }
        else{
            System.out.println("La letra " + a + " es una consonante.");
        }*/
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){      //aquí se compara la letra directamente con todas las vocales
            System.out.println("La letra " + a + " es una vocal.");
        }
        else {
            System.out.println("La letra " + a + " es una consonante.");
        }
    }      
}
