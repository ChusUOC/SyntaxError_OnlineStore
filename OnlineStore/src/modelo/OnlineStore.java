package modelo;

import java.util.Scanner;

/**
 * Online Store
 */
public class OnlineStore {
    Scanner teclado = new Scanner(System.in);
    /**
     * Inicio del programa
     * @param args En caso de pasar argumentos al programa.
     */
    public static void main(String[] args){
        OnlineStore prg = new OnlineStore();
        prg.inicio();
    }

    /**
     * Método para seleccionar una opción
     * @return Valor de la tecla pulsada.
     */
    char demanarOpcioMenu() {
        String resp;
        System.out.print("Elige una opción (1,2,3,4 o 0): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    void inicio(){
        OnlineStore vista_onlinestore;
    }

}
