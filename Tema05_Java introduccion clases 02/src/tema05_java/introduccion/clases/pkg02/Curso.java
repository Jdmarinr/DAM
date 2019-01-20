/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05_java.introduccion.clases.pkg02;

/**
 *
 * @author Aritz y Juan David
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos = 0;
    
    public Curso(){
        sumarCursos();
    }
    public void establecerNombreyHoras(String _nombre, int _numeroHoras){
        nombre = _nombre;
        numeroHoras = _numeroHoras;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerHoras(){
        return numeroHoras;
    }
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    public static int verNumeroCursos(){
        return numeroDeCursos;
    }
}
