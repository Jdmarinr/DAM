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
public class RegistroVentasDiaria {

    private LocalDate fecha;
    private double[] listaVentas;
    private int[] listCodProducto;

    public RegistroVentasDiaria(LocalDate _fecha, double[] _listaVentas, int[] _listCodProducto) {
        fecha = _fecha;
        listaVentas = _listaVentas;
        listCodProducto = _listCodProducto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getAnyo() {
        return fecha.getYear();
    }

    public int getMes() {
        return fecha.getMonthValue();
    }

    public int getDia() {
        return fecha.getDayOfMonth();
    }

    public void setFecha(LocalDate _fecha) {
        fecha = _fecha;
    }

    public void setAnyo(int _anyo) {
        fecha = LocalDate.of(_anyo, fecha.getMonthValue(), fecha.getDayOfMonth());
    }

    public void setMes(int _mes) {
        fecha = LocalDate.of(fecha.getYear(), _mes, fecha.getDayOfMonth());
    }

    public void setDia(int _dia) {
        fecha = LocalDate.of(fecha.getYear(), fecha.getMonthValue(), _dia);
    }

    public void imprimirRegistroVentas() {
        System.out.println("Fecha: " + fecha + "\n");
        for (int i = 0; i < listaVentas.length; i++) {
            System.out.println("Cod. " + listCodProducto[i]);
            System.out.println("Precio: " + listaVentas[i] + "\n");
        }
    }

    public double calcularMaximo() {
        double max = 0;
        for (int i = 0; i < listaVentas.length; i++) {
            if (max < listaVentas[i]) {
                max = listaVentas[i];
            }
        }
        return max;
    }

    public int calcularProductoEstrella() {
        int cod_mas_usado;
        int veces[] = new int[listCodProducto.length];
        int posicion = 0;
        //recorre la lista de codigos y guarda en el array veces las veces que sale cada codigo en su posicion
        for (int i = 0; i < listCodProducto.length; i++) {
            cod_mas_usado = listCodProducto[i];
            for (int j = 0; j < listCodProducto.length; j++) {
                if (listCodProducto[j] == cod_mas_usado) {
                    veces[i]++;
                }
            }
        }
        //recorre el array veces y guarda en posicion la posicion del codigo que mas veces aparece
        cod_mas_usado = 0;
        for (int k = 0; k < veces.length; k++) {
            if (cod_mas_usado < veces[k]) {
                cod_mas_usado = veces[k];
                posicion = k;
            }
        }
        return listCodProducto[posicion];
    }
}
