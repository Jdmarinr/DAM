package prog_ut4_ejercicios1;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT4_EJERCICIOS1 {

    public static void fEnEl7() {
        System.out.println("f en el 7:");
        char[] f = new char[100];
        f[6] = 'f';
        System.out.println(f[6]);
    }

    public static void valor8() {
        System.out.println("Valor 8:");
        int[] ar = new int[5];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = 8;
            System.out.println(ar[i]);
        }
    }

    public static void suma100() {
        System.out.println("Suma 100 elementos:");
        int[] c = new int[100];
        int sumaTotal = 0;
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
            sumaTotal = sumaTotal + c[i];
        }
        System.out.println(sumaTotal);
    }

    public static void copiar11() {
        System.out.println("Copiar 11");
        int[] a = new int[11];
        float[] b = new float[34];
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = (float) a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            
        }
    }

    public static void main(String[] args) {
        fEnEl7();
        valor8();
        suma100();
        copiar11();
    }

}
