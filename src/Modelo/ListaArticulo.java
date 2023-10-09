package Modelo;

import java.util.ArrayList;

public class ListaArticulo {
    private ArrayList<Articulo> listaArticulo;

    /**
     * Constructor de la clase con 1 parámetro
     * @param listaArticulo de tipo ListaArticulo
     */
    public ListaArticulo(ArrayList<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    /**
     * Getter del atributo listaArticulo
     * @return devuelve un ArrayList de tipo ListaArticulo
     */
    public ArrayList<Articulo> getListaArticulo() {
        return listaArticulo;
    }

    /**
     * Setter de atributo listaArticulo
     * @param listaArticulo recibe un ArrayList de tipo ListaArticulo
     */
    public void setListaArticulo(ArrayList<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    @Override
    public String toString() {
        return "ListaArticulo{" +
                "listaArticulo=" + listaArticulo +
                '}';
    }
}
