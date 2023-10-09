package Modelo;

public class Cliente {
    private String nombre;
    private String domicilio;
    private String nif;
    private String email;

    /**
     * Constructor de la clase con 4 parámetrsos
     * @param nombre de tipo String
     * @param domicilio de tipo String
     * @param nif de tipo String
     * @param email de tipo String
     */
    public Cliente(String nombre, String domicilio, String nif, String email) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.email = email;
    }

    /**
     * getter del atributo nombre
     * @return devuelve un String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     * @param nombre de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter del atributo domicilio
     * @return devuelve un String
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Setter del atributo domicilio
     * @param domicilio de tipo String
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * getter del atributo nif
     * @return devuelve un String
     */
    public String getNif() {
        return nif;
    }

    /**
     * Setter del atributo nif
     * @param nif de tipo String
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * getter del atributo email
     * @return devuelve un String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter del atributo email
     * @param email de tipo String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", nif='" + nif + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
