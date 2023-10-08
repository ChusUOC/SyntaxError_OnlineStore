package modelo; /**
 * Clase Modelo.articulo.java
 * Esta clase contiene las referencias a los artículos.
 */

import java.time.*;

public class articulo {

    private String codigo;
    private String descripcion;
    private double precioventa;
    private double gastosenvio;
    private LocalTime tiempopreparacion;

    /** Constructor de la clase Modelo.articulo
     *
     * @param Codigo Indica el código del artículo.
     * @param Descripcion Muestra la descripción del artículo.
     * @param PrecioVenta Precio venta del artículo.
     * @param GastosEnvio Gastos de envío del artículo.
     * @param TiempoPreparacion Tiempo de preparación del artículo. Es importante ya que idncia el momento en el que ya no se podrá cancelar el Modelo.pedido.
     */
    public articulo(String Codigo, String Descripcion, double PrecioVenta, double GastosEnvio, LocalTime TiempoPreparacion){
        this.codigo = Codigo;
        this.descripcion = Descripcion;
        this.precioventa = PrecioVenta;
        this.gastosenvio = GastosEnvio;
        this.tiempopreparacion = TiempoPreparacion;
    }

    /**
     * Getters and Setters
     */

    /**
     * Método que devuelve el código del artículo
     * @return Devuelve el código del artículo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo que establece el código del artículo
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método que devuelve la descripción del artículo
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *Método que establece la descripción del artículo
     * @param descripcion Descripción del artículo.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que devuelve el precio de venta del artículo
     * @return Precio de venta del artículo
     */
    public double getPrecioventa() {
        return precioventa;
    }

    /**
     * Método que establece el precio de venta del artículo
     * @param previoventa precio de venta del artículo
     */
    public void setPrecioventa(double previoventa) {
        this.precioventa = previoventa;
    }

    /**
     * Método que devuelve el importe de gastos de envío del artículo
     * @return gastos de envío del artículo
     */
    public double getGastosenvio() {
        return gastosenvio;
    }

    /**
     * Método que
     * @param gastosenvio
     */
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
                + "\nPrecio Venta : " + this.precioventa
                + "\nGastos envío: " + this.gastosenvio
                + "\nTiempo preparación: " + this.tiempopreparacion
                + "\n----------------------------------------------------\n";
    }
}
