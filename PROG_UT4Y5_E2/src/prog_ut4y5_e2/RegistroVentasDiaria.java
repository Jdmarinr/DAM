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
public class RegistroVentasDiaria {

    private LocalDate fecha;
    public Venta[] listaProductos;

    public RegistroVentasDiaria(LocalDate _fecha, int capacidad) {
        fecha = _fecha;
        listaProductos = new Venta[capacidad];
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

    public Venta[] getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Venta[] _listaProductos) {
        listaProductos = _listaProductos;
    }
    
    public void setVenta(Venta _venta, int _posicion){
        listaProductos[_posicion] = _venta;
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

    public void imprimirRegistroVentasDiaria() {
        System.out.println("Fecha: " + fecha + "\n");
        for (int i = 0; i < listaProductos.length; i++) {
            if (listaProductos[i] != null) {
                System.out.println(listaProductos[i].toString());
            }
            else{
                break;
            }
        }
        System.out.println("\n");
    }

    public boolean agregarVenta(Venta _venta) {
        boolean aux = false;
        for (int i = 0; i < listaProductos.length; i++) {
            if (listaProductos[i] == null) {
                listaProductos[i] = _venta;
                aux = true;
                break;
            }
        }
        return aux;
    }

    int buscarVenta(int _codProducto) {
        int aux = 0;
        for (int i = 0; i < listaProductos.length; i++) {
            if (_codProducto == listaProductos[i].getCodProducto()) {
                aux = i;
                break;
            }
        }
        return aux;
    }
    public double calcularMaximo() {
        double max = 0;
        for (int i = 0; i < listaProductos.length; i++) {
            if (max < listaProductos[i].getAbonado()) {
                max = listaProductos[i].getAbonado();
            }
        }
        return max;
    }

    public int calcularProductoEstrella() {
        int cod_mas_usado;
        int veces[] = new int[listaProductos.length];
        int posicion = 0;
        //recorre la lista de codigos y guarda en el array veces las veces que sale cada codigo en su posicion
        for (int i = 0; i < listaProductos.length; i++) {
            cod_mas_usado = listaProductos[i].getCodProducto();
            for (int j = 0; j < listaProductos.length; j++) {
                if (listaProductos[j].getCodProducto() == cod_mas_usado) {
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
        return listaProductos[posicion].getCodProducto();
    }
}
