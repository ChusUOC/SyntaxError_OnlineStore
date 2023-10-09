package Modelo;

public class Datos {
    private ListaCliente listaCliente;

    private ListaPedido listaPedido;

    private ListaArticulo listaArticulo;

    /**
     * Constructor de la clase con 3 parámetros
     * @param listaCliente de tipo ListaCliente
     * @param listaPedido de tipo ListaPedido
     * @param listaArticulo de tipo ListaArticulo
     */
    public Datos(ListaCliente listaCliente, ListaPedido listaPedido, ListaArticulo listaArticulo) {
        this.listaCliente = listaCliente;
        this.listaPedido = listaPedido;
        this.listaArticulo = listaArticulo;
    }

    /**
     * getter del atributo listaCliente
     * @return devuelve un ListaCliente
     */
    public ListaCliente getListaCliente() {
        return listaCliente;
    }

    /**
     * Setter del atributo listaCliente
     * @param listaCliente de tipo ListaCliente
     */
    public void setListaCliente(ListaCliente listaCliente) {
        this.listaCliente = listaCliente;
    }

    /**
     * getter del atributo listaPedido
     * @return devuelve un ListaPedido
     */
    public ListaPedido getListaPedido() {
        return listaPedido;
    }

    /**
     * Setter del atributo listaPedido
     * @param listaPedido de tipo ListaPedido
     */
    public void setListaPedido(ListaPedido listaPedido) {
        this.listaPedido = listaPedido;
    }

    /**
     * getter del atributo listaArticulo
     * @return devuelve un ListaArticulo
     */
    public ListaArticulo getListaArticulo() {
        return listaArticulo;
    }

    /**
     * Setter del atributo listaArticulo
     * @param listaArticulo de tipo ListaArticulo
     */
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
