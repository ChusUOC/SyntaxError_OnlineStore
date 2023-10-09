package Modelo;

import java.util.ArrayList;

public class ListaCliente {
    private ArrayList<Cliente> listaClientes ;

    /**
     * Constructor de la clase con 1 parámetro
     * @param listaClientes de tipo ListaCliente
     */
    public ListaCliente(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    /**
     * Getter del atributo listaCliente
     * @return devuelve un ArrayList de tipo ListaClientes
     */
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    /**
     * Setter de atributo listaClientes
     * @param listaClientes recibe un ArrayList de tipo ListaClientes
     */
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "ListaCliente{" +
                "listaClientes=" + listaClientes +
                '}';
    }
}
