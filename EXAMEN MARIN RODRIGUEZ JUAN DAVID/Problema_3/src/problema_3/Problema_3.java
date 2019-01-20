/*
Marín Rodríguez, Juan David.
 */
package problema_3;

public class Problema_3 {

    public static int a = 1000;                                                 //variable para dar rango al array 
    public static char[] array = new char[a];

                                                
    public static void aleator() {                                                      //Creamos el primer método con un array de carácteres aleatorios

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (Math.random() * 1000);   //Vamos guardando en el array los carácteres aleatorio
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);      //muestra por pantalla todos los valores
        }
    }

    //método de búsqueda del nombre
    public static void busqueda() {
        String miNombre = "Juan";                                        //variable de tipo String en la que se guarda mi nombre
        char a[] = miNombre.toCharArray();                                       //se convierte la cadena con mi nombre en un array de caracteres y se guarda en a
        boolean aux[] = new boolean[a.length];                                   //Creamos un array de booleanos de la misma longitud del array a
        int contador = 0;                                                   //se inicializa un contador a 0

        for (int i = 0; i < a.length; i++) {                                    //Se recorre el array 
            for (int j = 0; j < array.length; j++) {                                    
                if (a[i] == array[j]) {                                     //Indicamos si el caracter del array a en la posicion que se encuentra es igual al caracter del array en la posicion j y si coincide con alguna letra
                    aux[i] = true;                                      //Se guarda true en la posicion i del array de booleanos
                }
            }
        }
        for (int i = 0; i < aux.length; i++) {                                  //Recorremos el array auxiliar 
            if (aux[i] == true) {   
                contador++;     //En caso de que sea true umentamos el contador
            }
        }
        if (contador == aux.length) {   //Si el valor del contador es igual a la longitud del array aux
            System.out.println("Encontrado.");      //El array contiene las letras para formar mi nombre
        } else {    //si no es igual
            System.out.println("No encontrado.");  
        }
    }

    public static void main(String[] args) {
        aleator();
        busqueda();
    }

}
