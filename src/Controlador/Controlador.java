package Controlador;

import Modelo.Datos;

public class Controlador {
    private Datos datos;

    /**
     * Constructor de la clase
     * @param datos de tipo Datos
     */
    public Controlador(Datos datos) {
        this.datos = datos;
    }

    /**
     *  Getter del atributo datos
     * @return devuelve Tipo Dato
     */
    public Datos getDatos() {
        return datos;
    }

    /**
     *  Setter del atributo dato
     * @param datos de tipo Dato
     */
    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    /**
     *  Método para gestión Artículo
     */
    public void gestionArticuloLogic(){

    }

    /**
     *  Método para la gestión de pedidos
     */
    public void gestionPedidoLogic(){

    }

    /**
     * Método para la gestión de clientes
     */
    public void gestionClienteLogic(){

    }

    @Override
    public String toString() {
        return "Controlador{" +
                "datos=" + datos +
                '}';
    }
}
