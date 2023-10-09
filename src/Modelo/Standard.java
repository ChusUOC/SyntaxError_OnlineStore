package Modelo;

import java.sql.Time;
import java.util.Date;

public class Standard extends Cliente {

    private double cuota;


     /**
     * Constructor de la clase con herencia de la clase Pedido
     * @param nombre de tipo String
     * @param domicilio de tipo String
     * @param nif de tipo String
     * @param email de tipo String
     * @param cuota de tipo double
     */
    public Standard(String nombre, String domicilio, String nif, String email, double cuota) {
        super(nombre, domicilio, nif, email);
        this.cuota = cuota;
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
        return "Standard{" +
                "cuota=" + cuota +
                '}';
    }
}
