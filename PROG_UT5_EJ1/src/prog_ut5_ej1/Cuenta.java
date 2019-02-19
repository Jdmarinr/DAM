package prog_ut5_ej1;

/**
 *
 * @author Aritz y Juan David
 */
public class Cuenta {

    private double saldo;

    public Cuenta(double _saldo) {
        saldo = _saldo;
    }

    public Cuenta() {
        saldo = 20;
    }

    public void abonar (double cantidad){
        saldo += cantidad;
    }
    
    public double obtenerSaldo(){
        return saldo;
    }
    
    
}
