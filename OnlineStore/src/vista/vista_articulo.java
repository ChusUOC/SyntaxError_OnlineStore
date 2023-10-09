package vista;

import java.util.Scanner;

public class vista_articulo {

    Scanner teclado = new Scanner(System.in);

    /**
     * Método para seleccionar una opción
     * @return Valor de la tecla pulsada.
     */
    static char demanarOpcioMenu() {
        String resp;
        System.out.print("Elige una opción (1,2,3,4 o 0): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    /**
     * Menú de artículos
     */
    static void articulos(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("| Online Store - Menú Artículos             |");
            System.out.println("+-------------------------------------------+\n");
            System.out.println("1. Crear un artículo");
            System.out.println("2. Eliminar un artículo");
            System.out.println("3. Listar artículos");
            System.out.println("············································");
            System.out.println("0. Salir de la aplicación");
            System.out.println("============================================");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1' -> nuevoarticulo();
                case '2' -> borrararticulo();
                case '3' -> listararticulos();
                case '0' -> salir = true;
            }
        } while (!salir);
    }


    /**
     * Crear un nuevo artículo en la BBDD de Online Store
     */
    static void nuevoarticulo(){

    }

    /**
     * Borrar un artículo existente en la BBDD de Online Store
     */
    static void borrararticulo(){

    }

    /**
     * Listar artículos existentes en la BBDD de Online Store
     */
    static void listararticulos(){

    }

}
