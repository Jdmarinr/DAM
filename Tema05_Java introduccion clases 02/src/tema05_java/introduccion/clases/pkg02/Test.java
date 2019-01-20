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
public class Test {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        

        curso1.establecerNombreyHoras("Curso 1", 30);
        curso2.establecerNombreyHoras("Curso 2", 15);

        System.out.println(curso1.obtenerNombre() + ": " + curso1.obtenerHoras() + " horas.");
        System.out.println(curso2.obtenerNombre() + ": " + curso2.obtenerHoras() + " horas.");
        System.out.println("El número de cursos es: " + Curso.verNumeroCursos());
    }

}
