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
public class Compra {
    private int idCompra;
    private String concepto;
    private double importe;
    private int cuotas;
    private Tarjeta tarjeta;
    private String fecha;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Compra() {
    }

    public Compra(int idCompra, String concepto, double importe, int cuotas, Tarjeta tarjeta, String fecha) {
        this.idCompra = idCompra;
        this.concepto = concepto;
        this.importe = importe;
        this.cuotas = cuotas;
        this.tarjeta = tarjeta;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Compra: ");
        s.append(" Número de compra: ");
        s.append(idCompra);
        s.append(" Concepto: ");
        s.append(concepto);
        s.append(" Importe: ");
        s.append(importe);
        s.append(" Tarjeta: ");
        s.append(tarjeta.getDenominacion());
        s.append(" Fecha: ");
        s.append(fecha);
        s.append("\n");
        return s.toString();
    }
}
