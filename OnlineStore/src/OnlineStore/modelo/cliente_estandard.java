package OnlineStore.modelo;

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
     * Otros métodos
     */

    @Override
    public float descuentoEnv() {
        // Aquí proporciona la implementación concreta del descuento en envío.
        // Por ejemplo, calcula el descuento y devuelve el valor en float.
        float descuento = 5.0f; // Ejemplo: un descuento fijo de $5.0
        return descuento;
    }

    @Override
    public float calcAnual() {
        // Aquí proporciona la implementación concreta del descuento en envío.
        // Por ejemplo, calcula el descuento y devuelve el valor en float.
        float descuento = 5.0f; // Ejemplo: un descuento fijo de $5.0
        return descuento;
    }

    @Override
    public String tipoCliente() {
        // Aquí proporciona la implementación concreta del descuento en envío.
        // Por ejemplo, calcula el descuento y devuelve el valor en float.
        String Tipo="prueba"; // Ejemplo: un descuento fijo de $5.0
        return Tipo;
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
