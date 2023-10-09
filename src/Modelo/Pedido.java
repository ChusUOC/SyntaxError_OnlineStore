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

    /**
     * Constructor de la clase con 8 parámetros
     * @param articulo de tipo Articulo
     * @param cliente de tipo Cliente
     * @param totalPrecio de tipo double
     * @param numero de tipo int
     * @param descripcion de tipo String
     * @param fecha de tipo Date
     * @param hora de tipo Time
     * @param tiempo de tipo Time
     */
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

    /**
     * Getter del atributo articulo
     * @return devuelve un tipo Articulo
     */

    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * Setter de atributo articulo
     * @param articulo recibe un ArrayList de tipo Articulo
     */
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    /**
     * Getter del atributo cliente
     * @return devuelve un tipo Cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Setter de atributo cliente
     * @param cliente recibe un ArrayList de tipo Cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Getter del atributo totalPrecio
     * @return devuelve un tipo double
     */
    public double getTotalPrecio() {
        return totalPrecio;
    }

    /**
     * Setter de atributo totalPrecio
     * @param totalPrecio recibe un ArrayList de tipo double
     */
    public void setTotalPrecio(double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    /**
     * Getter del atributo numero
     * @return devuelve un tipo int
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Setter de atributo numero
     * @param numero recibe un ArrayList de tipo int
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Getter del atributo descripcion
     * @return devuelve un tipo String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter de atributo descripcion
     * @param descripcion recibe un ArrayList de tipo int
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter del atributo fecha
     * @return devuelve un tipo Date
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Setter de atributo fecha
     * @param fecha recibe un ArrayList de tipo Date
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter del atributo hora
     * @return devuelve un tipo Time
     */
    public Time getHora() {
        return hora;
    }

    /**
     * Setter de atributo hora
     * @param hora recibe un ArrayList de tipo Time
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }

    /**
     * Getter del atributo tiempo
     * @return devuelve un tipo Time
     */
    public Time getTiempo() {
        return tiempo;
    }

    /**
     * Setter de atributo tiempo
     * @param tiempo recibe un ArrayList de tipo Time
     */
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
