package Modelo;

public class Premium extends Cliente{
    private double descuento;
    private double cuota;

    /**
     * Constructor de la clase con herencia de la clase Pedido
     * @param nombre de tipo String
     * @param domicilio de tipo String
     * @param nif de tipo String
     * @param email de tipo String
     * @param descuento de tipo double
     * @param cuota de tipo double
     */
    public Premium(String nombre, String domicilio, String nif, String email, double descuento, double cuota) {
        super(nombre, domicilio, nif, email);
        this.descuento = descuento;
        this.cuota = cuota;
    }

    /**
     * getter del atributo descuento
     * @return devuelve un tipo double
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * setter del atributo descuento
     * @param descuento de tipo double
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * getter del atributo cuota
     * @return devuelve un tipo double
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * setter del atributo cuota
     * @param cuota de tipo double
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Premium{" +
                "descuento=" + descuento +
                ", cuota=" + cuota +
                '}';
    }
}
