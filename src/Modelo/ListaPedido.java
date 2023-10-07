package Modelo;

import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> listaPedido;

    public ListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    @Override
    public String toString() {
        return "ListaPedido{" +
                "listaPedido=" + listaPedido +
                '}';
    }
}
