package Modelo;

public class Datos {
    private ListaCliente listaCliente;

    private ListaPedido listaPedido;

    private ListaArticulo listaArticulo;

    public Datos(ListaCliente listaCliente, ListaPedido listaPedido, ListaArticulo listaArticulo) {
        this.listaCliente = listaCliente;
        this.listaPedido = listaPedido;
        this.listaArticulo = listaArticulo;
    }

    public ListaCliente getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ListaCliente listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ListaPedido getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(ListaPedido listaPedido) {
        this.listaPedido = listaPedido;
    }

    public ListaArticulo getListaArticulo() {
        return listaArticulo;
    }

    public void setListaArticulo(ListaArticulo listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "listaCliente=" + listaCliente +
                ", listaPedido=" + listaPedido +
                ", listaArticulo=" + listaArticulo +
                '}';
    }
}
