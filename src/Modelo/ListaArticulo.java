package Modelo;

import java.util.ArrayList;

public class ListaArticulo {
    private ArrayList<Articulo> listaArticulo;

    public ListaArticulo(ArrayList<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    public ArrayList<Articulo> getListaArticulo() {
        return listaArticulo;
    }

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
