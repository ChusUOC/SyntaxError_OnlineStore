package OnlineStore.modelo;

public abstract class cliente {

    private String nif;
    private String nombre;
    private String domicilio;

    /**
     * Constructor de la clase padre Cliente
     * @param NIF NIF del Modelo.cliente
     * @param Nombre Nombre del Modelo.cliente
     * @param Domicilio Domicilio del Modelo.cliente
     */
    public cliente(String NIF, String Nombre, String Domicilio){
        this.nif = NIF;
        this.nombre = Nombre;
        this.domicilio = Domicilio;
    }

    /**
     * Getters y Setters de la clase
     */

    /**
     * Método que devuelve el NIF del Modelo.cliente
     * @return NIF del Cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Método que establece el NIF del Modelo.cliente
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Método que establece el nombre del Modelo.cliente
     * @return Nombre del Modelo.cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el nombre del Modelo.cliente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que establece la dirección del domicilio del Modelo.cliente.
     * @return Domicilio del Modelo.cliente
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Método que devuelve la dirección del domicilio del Modelo.cliente.
     * @param domicilio
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Otros métodos a implementar
     */

    public abstract String tipoCliente();

    public abstract float calcAnual();

    public abstract float descuentoEnv();

    /**
     * Método que devuelve la información del Modelo.cliente.
     * @return Detalle del Modelo.cliente.
     */
    @Override
    public String toString() {
        return "\nNIF: " + this.nif
                + "\nNombre del Modelo.cliente: " + this.nombre
                + "\nDirección : " + this.domicilio
                + "\n----------------------------------------------------\n";
    }
}
