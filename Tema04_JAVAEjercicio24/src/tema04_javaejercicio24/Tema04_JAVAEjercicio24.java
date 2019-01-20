/*
Hace un examen al usuario, preguntándole la capital de España y quién descubrió América.
Le dirá si ha respondido correctamente o no, cuál era la respuesta correcta, y por último le dira su nota(un 0, un 5 o un 10)
 */
package tema04_javaejercicio24;

import java.util.Scanner;

/**
 *
 * @author Aritz y Juan David
 */
public class Tema04_JAVAEjercicio24 {

    //Variables
    static String res1 = "Madrid";
    static String res2 = "Colon";
    static String r1, r2;
    static int aciertos = 0;
    static int notaFinal;
    static Scanner sc = new Scanner(System.in);

    public static void pregunta1() {
        System.out.println("EXAMEN DE CULTURA GENERAL\n1ªPREGUNTA: ¿Cuál es la capital del REINO en la actualidad?");
        r1 = sc.next();
        if (r1.equalsIgnoreCase(res1)) {
            System.out.println("Muy bien, respuesta correcta.");
            aciertos++;
        } else {
            System.out.println("Incorrecto. La respusta correcta sería: " + res1);
        }
    }

    public static void pregunta2() {
        System.out.println("2ªPREGUNTA: ¿Quién descubrió América?");
        r2 = sc.next();
        if (r2.equalsIgnoreCase(res2)) {
            System.out.println("Muy bien, respuesta correcta.");
            aciertos++;
        } else {
            System.out.println("Incorrecto. La respusta correcta sería: " + res2);
        }
    }

    public static int nota() {
        switch (aciertos) {
            case 0:
                notaFinal = 0;
                break;
            case 1:
                notaFinal = 5;
                break;
            case 2:
                notaFinal = 10;
                break;
        }
        return notaFinal;
    }

    public static void main(String[] args) {
        pregunta1();
        pregunta2();
        System.out.println("NOTA DEL EXAMEN: " + nota());
    }

}
