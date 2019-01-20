package tema05e1;

/**
 *
 * @author Aritz(joputa) y Juan David(el que trabaja).
 */
public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;

    public Coche() {

    }

    public void establecerMarca(String _marca) {
        marca = _marca;
    }

    public void establecerModelo(String _modelo) {
        modelo = _modelo;
    }

    public void establecerColor(String _color) {
        color = _color;
    }

    public void arrancarCoche() {
        if (motorEncendido == true) {
            System.out.println("El motor ya estaba encendido.");
        } else {
            motorEncendido = true;
            velocidad = 10;
        }
    }

    public void apagarCoche() {
        if (motorEncendido == false) {
            System.out.println("El motor ya estaba apagado.");
        } else {
            motorEncendido = false;
            velocidad = 0;
        }
    }

    public void acelerarCoche() {
        velocidad = velocidad + 20;
    }

    public void frenarCoche() {
        velocidad = velocidad - 6;
    }

    public void obtenerEstado() {
        
        System.out.println("La marca del coche es " + marca);
        System.out.println("El modelo del coche es " + modelo);
        System.out.println("El color del coche es " + color);
        if (motorEncendido == true) {
            System.out.println("El motor del coche está encendido");
        } else {
            System.out.println("El motor del coche está apagado");
        }
        System.out.println("La velocidad del coche es " + velocidad + "\n");
    }

}
