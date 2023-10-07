package Modelo;

import java.sql.Time;
import java.util.Date;

public class Standard extends Pedido {

    private double cuota;

    public Standard(Articulo articulo, Cliente cliente, double totalPrecio, int numero, String descripcion, Date fecha, Time hora, Time tiempo, double cuota) {
        super(articulo, cliente, totalPrecio, numero, descripcion, fecha, hora, tiempo);
        this.cuota = cuota;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Standard{" +
                "cuota=" + cuota +
                '}';
    }
}
