/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_ut4y5_e2;

/**
 *
 * @author Aritz y Juan David
 */
public class Venta {
    private int codProducto;
    private double abonado;
    
    Venta(int _codProducto, double _abonado){
        codProducto = _codProducto;
        abonado = _abonado;
    }
    
    public int getCodProducto(){
        return codProducto;
    }
    
    public double getAbonado(){
        return abonado;
    }
    
    public void setCodProducto(int _codProducto){
        codProducto = _codProducto;
    }

    public void setAbonado(double _abonado) {
        abonado = _abonado;
    }

    @Override
    public String toString() {
        return "Venta{" + "codProducto=" + codProducto + ", abonado=" + abonado + "}";
    }
    
}
