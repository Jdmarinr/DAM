/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05e5;

/**
 *
 * @author jdmarin
 */
public class Ciclo {
    //Atributos
    String nombre;
    int nota;
    static double sumaNotas =0;
    static double media;
    
    public Ciclo(String _nombre) { //Constructor con el que asignamos nombre al crear el objeto
        nombre = _nombre;
    }

    public void setNota(int _nota) { //Creamos un método con _nota como parámetro
        nota = _nota;
        sumarNotas();       //Cada vez que se le pasa una nota se invoca el método SumarNotas
    }

    public int getNota() {   
        return nota;
    }

    public void sumarNotas(){  //Suma las notas que se van introduciendo
        sumaNotas+=nota;
    }

    public static double getMedia() {  //Devuelve la media
        media = (sumaNotas/6);
        return media;
    }
    
    
}
