package Modelo;

public class Premium extends Cliente{
    private double descuento;
    private double cuota;

    public Premium(String nombre, String domicilio, String nif, String email, double descuento, double cuota) {
        super(nombre, domicilio, nif, email);
        this.descuento = descuento;
        this.cuota = cuota;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getCuota() {
        return cuota;
    }

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
