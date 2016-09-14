/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author AdminFull
 */
public class Tarjeta {
    private int idTarjeta;
    private String denominacion;

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, String denominacion) {
        this.idTarjeta = idTarjeta;
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "TC " + denominacion;
    }   
}
