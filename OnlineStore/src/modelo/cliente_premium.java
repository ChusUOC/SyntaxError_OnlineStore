package modelo;

public class cliente_premium extends cliente {

    private int cuota;
    private double descuento;

    public cliente_premium(String NIF, String Nombre, String Domicilio, int Cuota, double Descuento){
        super(NIF, Nombre, Domicilio);
        this.cuota=Cuota;
        this.descuento=Descuento;
    }

    /**
     * Getters y Setters de la clase
     */

    /**
     * Método que devuelve el importe de la cuota del Modelo.cliente.
     * @return Cuota del Modelo.cliente
     */
    public int getCuota() {
        return cuota;
    }

    /**
     * Método que establece la cuota del Modelo.cliente.
     * @param cuota
     */
    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    /**
     * Método que edevuelve el Descuento a aplicar al Modelo.cliente
     * @return Descuento del Modelo.cliente.
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Método que establece el descuento a aplicar al Modelo.cliente.
     * @param descuento
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * Método que devuelve la cuota y el descuento a aplicar al Modelo.cliente.
     * @return Detalle del artículo.
     */
    @Override
    public String toString() {
        return super.toString()
                + "\nCliente premium"
                + "\nCuota: " + this.cuota
                + "\nDescuento: " + this.descuento
                + "\n----------------------------------------------------\n";
    }
}
