/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05e4;

/**
 *
 * @author Aritz y Juan David
 */
public class Pajarito {

    static int numpajaros = 0;
    String color;
    int edad;

    public void nuevopajaro() {
        numpajaros++;
    }

    public void establecerColoryEdad(String _color, int _edad) {
        color = _color;
        edad = _edad;
        nuevopajaro();
    }

    public static int muestraPajaros() {
        return numpajaros;
    }

}
