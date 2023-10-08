/**
 * Clase articulo.java
 * Esta clase contiene las referencias a los artículos.
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class articulo {

    private String codigo;
    private String descripcion;
    private double previoventa;
    private double gastosenvio;
    private LocalTime tiempopreparacion;

    /** Constructor de la clase articulo
     *
     * @param Codigo Indica el código del artículo.
     * @param Descripcion Muestra la descripción del artículo.
     * @param PrecioVenta Precio venta del artículo.
     * @param GastosEnvio Gastos de envío del artículo.
     * @param TiempoPreparacion Tiempo de preparación del artículo. Es importante ya que idncia el momento en el que ya no se podrá cancelar el pedido.
     */
    public articulo(String Codigo, String Descripcion, double PrecioVenta, double GastosEnvio, LocalTime TiempoPreparacion){
        this.codigo = Codigo;
        this.descripcion = Descripcion;
        this.previoventa = PrevioVenta;
        this.gastosenvio = GastosEnvio;
        this.tiempopreparacion = TiempoPreparacion;
    }

    /**
     * Getters and Setters
     */

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrevioventa() {
        return previoventa;
    }

    public void setPrevioventa(double previoventa) {
        this.previoventa = previoventa;
    }

    public double getGastosenvio() {
        return gastosenvio;
    }

    public void setGastosenvio(double gastosenvio) {
        this.gastosenvio = gastosenvio;
    }

    public LocalTime getTiempopreparacion() {
        return tiempopreparacion;
    }

    public void setTiempopreparacion(LocalTime tiempopreparacion) {
        this.tiempopreparacion = tiempopreparacion;
    }

    /**
     * Método que devuelve datos del artículo.
     * @return Detalle del artículo.
     */
    @Override
    public String toString() {
        return "\nCódigo: " + this.codigo
                + "\nDescripción: " + this.descripcion
                + "\nPrecio Venta : " + this.previoventa
                + "\nGastos envío: " + this.gastosenvio
                + "\nTiempo preparación: " + this.tiempopreparacion
                + "\n\n----------------------------------------------------\n";
    }
}
}
