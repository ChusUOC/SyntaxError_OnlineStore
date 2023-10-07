package Controlador;

import Modelo.Datos;

public class Controlador {
    private Datos datos;

    public Controlador(Datos datos) {
        this.datos = datos;
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
    public void gestionArticuloLogic(){

    }
    public void gestionPedidoLogic(){

    }
    public void gestionClienteLogic(){

    }
    @Override
    public String toString() {
        return "Controlador{" +
                "datos=" + datos +
                '}';
    }
}
