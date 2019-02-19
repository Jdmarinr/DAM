package prog_ut5_ej2;

/**
 *
 * @author Aritz y Juan David
 */
public class LibroCalificaciones {

    private String nombreCurso;
    int[] calificaciones;

    public LibroCalificaciones(String _nombreCurso, int[] _calificaciones) {
        nombreCurso = _nombreCurso;
        calificaciones = _calificaciones;
    }

    public int obtenerMaximo() {
        int max = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (max < calificaciones[i]) {
                max = calificaciones[i];
            }
        }
        return max;
    }

    public int obtenerMinimo() {
        int min = 10;
        for (int i = 0; i < calificaciones.length; i++) {
            if (min > calificaciones[i]) {
                min = calificaciones[i];
            }
        }
        return min;
    }

    public double obtenerMedia() {
        double total = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            total += calificaciones[i];
        }
        return total / calificaciones.length;
    }

    public void imprimirGraficoBarras() {
        for (int i = 0; i <= 10; i++) {
            String cont = "";
            for (int j = 0; j < calificaciones.length; j++) {
                if (i == calificaciones[j]) {
                    cont = cont + "*";
                }
            }
            System.out.println(i + cont);
        }

    }

}
