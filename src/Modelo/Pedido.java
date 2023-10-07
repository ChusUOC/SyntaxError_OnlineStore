package Modelo;

import java.sql.Time;
import java.util.Date;

public class Pedido {
    private Articulo articulo;
    private Cliente cliente;
    private double totalPrecio;
    private int numero;
    private String descripcion;
    private Date fecha;
    private Time hora;
    private Time tiempo;

    public Pedido(Articulo articulo, Cliente cliente, double totalPrecio, int numero, String descripcion, Date fecha, Time hora, Time tiempo) {
        this.articulo = articulo;
        this.cliente = cliente;
        this.totalPrecio = totalPrecio;
        this.numero = numero;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.tiempo = tiempo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Time getTiempo() {
        return tiempo;
    }

    public void setTiempo(Time tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "articulo=" + articulo +
                ", cliente=" + cliente +
                ", totalPrecio=" + totalPrecio +
                ", numero=" + numero +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", tiempo=" + tiempo +
                '}';
    }
}
