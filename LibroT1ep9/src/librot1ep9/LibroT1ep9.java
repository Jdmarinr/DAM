package librot1ep9;

/**
 *
 * @author dam
 */
public class LibroT1ep9 {

    public static void main(String[] args) {
        boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);    //va a imprimir true porque el valor del caracter 'a' es 97
        
        int a = 1;
        int b = a>>>2;
        System.out.println(b);      //va a imprimir 0 porque 1=0001 1>>>2 sería 0000 entonces b=0
   
        int c = 7|4;
        System.out.println(c);      //va a imprimir 7 porque 7->0111 y 4->0100 compara los bits y los que son 1 los deja como 1 entonces 0111
        int d = 3|4;
        System.out.println(d);      //va a imprimir 7 porque 3->0011 y 4->0100 compara los bits y los que son 1 los deja como 1 entonces 0111
        
        int e = 7&4;
        System.out.println(e);      //va a imprimir 4 porque 7->0111 y 4->0100 compara los bits y si los 2 son un 1 los deja como 1 entonces 0100
        int f = 3&4;
        System.out.println(f);      //va a imprimir 0 porque 3->0011 y 4->0100 compara los bits y si los 2 son un 1 los deja como 1 entonces 0000
        
        int g = ~4;
        System.out.println(g);      //va a imprimir -5 porque 4->0100 e invierte los bits entonces 1011 que es -5
        
        int h = (~4*5)&1;
        System.out.println(h);      //va a imprimir 1 porque 4->0100 e invierte los bits entonces 1011 que es -5
                                    //-5*5=-25 y 25->011001 -25->111001 y 1->000001 compara los bits y si los 2 son un 1 los deja como 1 entonces 000001
    }
    
}
