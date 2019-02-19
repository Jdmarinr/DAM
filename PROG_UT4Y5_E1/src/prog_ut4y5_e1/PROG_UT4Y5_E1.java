/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_ut4y5_e1;

import java.time.LocalDate;

/**
 *
 * @author Aritz y Juan David
 */
public class PROG_UT4Y5_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double arrayVentas[] = {500.25, 100.50, 17.75, 250.50, 500.50, 10.60};
        int arrayCodProducto[] = {4, 2, 3, 3, 4, 4};
        LocalDate fecha = LocalDate.now();
        
        
        RegistroVentasDiaria registroVentaLunes = new RegistroVentasDiaria(fecha, arrayVentas, arrayCodProducto);

        registroVentaLunes.imprimirRegistroVentas();
        
        registroVentaLunes.setAnyo(2020);
        
        registroVentaLunes.imprimirRegistroVentas();
        
        System.out.println("El máximo de ventas es: " + registroVentaLunes.calcularMaximo());
        
        System.out.println("\nEl producto estrella es: Cod. " + registroVentaLunes.calcularProductoEstrella());
    }
    
}
