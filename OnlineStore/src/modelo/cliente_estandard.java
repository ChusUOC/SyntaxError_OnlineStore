package modelo;

/**
 * Clase Modelo.cliente estandard
 * Clase hija de Modelo.cliente.
 */

public class cliente_estandard extends cliente {

    /**
     * Constructor de la clase padre Cliente
     *
     * @param NIF       NIF del Modelo.cliente
     * @param Nombre    Nombre del Modelo.cliente
     * @param Domicilio Domicilio del Modelo.cliente
     */
    public cliente_estandard(String NIF, String Nombre, String Domicilio) {
        super(NIF, Nombre, Domicilio);
    }

    /**
     * Método que devuelve datos del artículo.
     * @return Detalle del artículo.
     */
    @Override
    public String toString() {
        return super.toString()
                + "\nCliente estandard"
                + "\n----------------------------------------------------\n";
    }
}
