/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_ut4y5_e2;

import java.time.LocalDate;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT4Y5_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        RegistroVentasDiaria registroVentaLunes = new RegistroVentasDiaria(fecha, 5);

        Venta ventaLunes1 = new Venta(12, 125.0);
        Venta ventaLunes2 = new Venta(4, 255.3);
        Venta ventaLunes3 = new Venta(15, 152.9);
        Venta ventaLunes4 = new Venta(28, 2000.55);

        System.out.println(registroVentaLunes.agregarVenta(ventaLunes1));
        System.out.println(registroVentaLunes.agregarVenta(ventaLunes2));
        System.out.println(registroVentaLunes.agregarVenta(ventaLunes3));
        System.out.println(registroVentaLunes.agregarVenta(ventaLunes1));
        System.out.println(registroVentaLunes.agregarVenta(ventaLunes1));
        System.out.println(registroVentaLunes.agregarVenta(ventaLunes1));

        registroVentaLunes.imprimirRegistroVentasDiaria();
        
        System.out.println("El código buscado está en la posición: " + registroVentaLunes.buscarVenta(12) + "\n");

        System.out.println("El máximo de ventas es: " + registroVentaLunes.calcularMaximo() + "\n");

        System.out.println("El producto estrella es: Cod. " + registroVentaLunes.calcularProductoEstrella() + "\n");

        registroVentaLunes.setVenta(ventaLunes4, 0);
        registroVentaLunes.setAnyo(2020);

        registroVentaLunes.imprimirRegistroVentasDiaria();

        System.out.println("El código buscado está en la posición: " + registroVentaLunes.buscarVenta(12) + "\n");

        System.out.println("El máximo de ventas es: " + registroVentaLunes.calcularMaximo() + "\n");

        System.out.println("El producto estrella es: Cod. " + registroVentaLunes.calcularProductoEstrella() + "\n");
    }

}
