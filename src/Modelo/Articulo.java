package Modelo;

import java.util.Date;

public class Articulo {
    private String cp;
    private String descripcion;
    private double precio;
    private double gastosEnvio;
    private Date tiempoPreparacion;

    /**
     *  Constructor de la clase con 5 parámetros
     * @param cp de tipo String
     * @param descripcion de tipo String
     * @param precio de tipo double
     * @param gastosEnvio de tipo double
     * @param tiempoPreparacion de tipo Date
     */
    public Articulo(String cp, String descripcion, double precio, double gastosEnvio, Date tiempoPreparacion) {
        this.cp = cp;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gastosEnvio = gastosEnvio;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    /**
     * Getter del atributo cp
     * @return devuelve un tipo String
     */
    public String getCp() {
        return cp;
    }

    /**
     * Setter del atributo cp
     * @param cp de tipo String
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * Getter del atributo descripción
     * @return devuelve un tipo String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter del atributo descripcion
     * @param descripcion de tipo String
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter del atributo precio
     * @return devuelve un tipo double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del atributo precio
     * @param precio de tipo double
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter del atributo GastosEnvío
     * @return devuelve un tipo double
     */
    public double getGastosEnvio() {
        return gastosEnvio;
    }

    /**
     * Setter del atributo gastosEnvios
     * @param gastosEnvio de tipo double
     */
    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    /**
     * Getter del atributo TiempoPreparación
     * @return devuelve un tipo Date
     */
    public Date getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    /**
     * Setter del atributo tiempoPrparacion
     * @param tiempoPreparacion de tipo Date
     */
    public void setTiempoPreparacion(Date tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "cp='" + cp + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", gastosEnvio=" + gastosEnvio +
                ", tiempoPreparacion=" + tiempoPreparacion +
                '}';
    }
}
