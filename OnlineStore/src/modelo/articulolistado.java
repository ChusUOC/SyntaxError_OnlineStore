package modelo;

import java.util.ArrayList;

public class articulolistado {

    private ArrayList<articulo> ARR_Articulo;

    public articulolistado(){
        ArrayList<articulo> ARR_Articulo = new ArrayList<>();
    }

    void mostrararticulo(String Codigo){
        for (int i =0; i<ARR_Articulo.size(); i++){
            if (Codigo == ARR_Articulo.get(i).getCodigo()) {
                System.out.println("Índice (" + i + ") : " + ARR_Articulo.get(i));
            }
        }
    }

    void listararticulos(){
        for (int i =0; i<ARR_Articulo.size(); i++){
            System.out.println("Índice (" + i + ") : " + ARR_Articulo.get(i));
        }
    }

    void eliminararticulo(int Indice){
        ARR_Articulo.remove(Indice);
    }

    void insertararticulo(articulo Articulo){
        ARR_Articulo.add(Articulo);
    }
}
