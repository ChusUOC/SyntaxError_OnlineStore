package Modelo;

import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> listaPedido;
    /**
     * Constructor de la clase con 1 parámetro
     * @param listaPedido de tipo ListaPedido
     */
    public ListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }
    /**
     * Getter del atributo listapedido
     * @return devuelve un ArrayList de tipo ListaPedido
     */
    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }
    /**
     * Setter de atributo listaPedido
     * @param listaPedido recibe un ArrayList de tipo ListaPedido
     */
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
