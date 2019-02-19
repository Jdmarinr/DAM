//Diez Maseda, Aritz
package problema3;

public class Problema3 {

    //variables que se utilizan en más de un metodo
    public static int a = 500;  //variable para dar rango al array de caracteres, se inicializa a 500
    public static char[] ar = new char[a];  //array de caracteres inicializado con rango a

    //metodo que crea un array de caracteres aleatorios
    public static void arrayAleatorio() {

        for (int i = 0; i < ar.length; i++) {   //para todo i menor que la longitud del array ar
            ar[i] = (char) (Math.random() * 255);   //se guarda en ar[i] un caracter aleatorio
        }
        for (int i = 0; i < ar.length; i++) {   //para todo i menor que la longitud del array ar
            System.out.println(ar[i]);      //muestra por pantalla todos los valores del array ar
        }
    }

    //metodo que busca mi nombre
    public static void buscar() {
        String nombre = "aritz";    //variable de tipo String en la que se guarda mi nombre
        char[] n = nombre.toCharArray();    //se convierte la cadena con mi nombre en un array de caracteres y se guarda en n
        int cont = 0;   //se inicializa un contador a 0
        boolean aux[] = new boolean[n.length];  //se crea un array de booleanos con la longitud del array n que contiene mi nombre
        
        for (int i = 0; i < n.length; i++) {    //recorre el array n
            for (int j = 0; j < ar.length; j++) {   //recorre el array ar (aleatorio)
                if (n[i] == ar[j]) {    //si el caracter del array n en la posicion i es igual al caracter del array ar en la posicion j indica que la primera letra de mi nombre esta en el ar
                    aux[i] = true;      //guarda true en la posicion i del array de booleanos
                } 
            }
        }
        for (int i = 0; i < aux.length; i++) {  //recorre el array aux de booleanos
            if (aux[i] == true) {   //si hay un true en la posicion i del array aux
                cont++;     //suma 1 al contador
            }
        }
        if (cont == aux.length) {   //si el valor del contador es igual a la longitud del array aux
            System.out.println("Encontrado.");      //el array ar (aleatorio) contiene las letras para formar mi nombre
        } else {    //si no es igual
            System.out.println("No encontrado.");   //no las contiene todas
        }
    }

    public static void main(String[] args) {
        //llama a los metodos arrayAleatorio() y buscar()
        arrayAleatorio();
        buscar();
    }

}
