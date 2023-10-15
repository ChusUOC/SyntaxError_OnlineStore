package OnlineStore.modelo;

import java.util.ArrayList;

public class Lista<T> {

    private ArrayList < T > lista = new ArrayList < T >();

    public ArrayList<T> getLista(){
        return lista;
    }
    void mostrarlista(){
        for (T elemento : this.lista) {
            System.out.println(this.lista);
        }
    }

    public void eliminarElemento(int posicion) {
        if (posicion >= 0 && posicion < this.lista.size()) {
            this.lista.remove(posicion);
        } else {
            System.out.println("La posición no es válida.");
        }
    }

    public void add(T objeto){
        this.lista.add(objeto);
    }


}
