package OnlineStore.modelo;

import java.util.ArrayList;

public class Lista<T> {

    private ArrayList < T > lista = new ArrayList < T >();


    void mostrarlista(){
        for (T elemento : this.lista) {
            System.out.println(this.lista);
        }
    }

    public ArrayList<T> getArrayList() {
        ArrayList<T> arrlist = new ArrayList<>(lista);
        return arrlist;
    }

    public void mostrartodo(){
        System.out.println(this.lista);
    }

    public int getSize(){
        // Realizar
        return this.lista.size();
    }

    public T getAt (int posicion){
        return this.lista.get(posicion);
    }

    public void eliminarElemento(int posicion) {
        if (posicion >= 0 && posicion < this.lista.size()) {
            this.lista.remove(posicion);
        } else {
            System.out.println("La posición no es válida.");
        }
    }

    public void clear(){


    }

    public void borrar (T t){

    }

    public void add(T objeto){
        this.lista.add(objeto);
    }


}
