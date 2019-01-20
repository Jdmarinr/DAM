package tema05e3;

/**
 *
 * @author Aritz y Juan David
 */
public class Coche {

    private String marca;
    private String modelo;
    private Rueda ruedas;

    public void establecerMarca(String _marca) {
        marca = _marca;
    }

    public void establecerModelo(String _modelo) {
        modelo = _modelo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void establecerRueda(Rueda _ruedas) {
        ruedas = _ruedas;
    }

    public Rueda obtenerRueda() {
        return ruedas;
    }
}
