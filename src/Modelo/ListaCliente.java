package Modelo;

import java.util.ArrayList;

public class ListaCliente {
    private ArrayList<Cliente> listaClientes ;

    public ListaCliente(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

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
