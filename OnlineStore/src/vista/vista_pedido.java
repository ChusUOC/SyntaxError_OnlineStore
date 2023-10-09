package vista;

import java.util.Scanner;

public class vista_pedido {

    Scanner teclado = new Scanner(System.in);

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

    void pedidos(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("| Online Store - Menú Pedidos               |");
            System.out.println("+-------------------------------------------+\n");
            System.out.println("1. Crear un Modelo.pedido");
            System.out.println("2. Eliminar un Modelo.pedido");
            System.out.println("3. Ver un Modelo.pedido");
            System.out.println("4. Listar pedidos pendientes");
            System.out.println("5. Listar pedidos enviados");
            System.out.println("············································");
            System.out.println("0. Salir de la aplicación");
            System.out.println("============================================");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1' -> nuevopedido();
                case '2' -> eliminarpedido();
                case '3' -> verpedido();
                case '4' -> listarpedidospendientes();
                case '5' -> listarpedidosenviados();
                case '0' -> salir = true;
            }
        } while (!salir);
    }

    /**
     * Método para introducir pedidos nuevos
     */
    void nuevopedido(){

    }

    /**
     * Método para eliminar un Modelo.pedido
     */
    void eliminarpedido(){

    }

    /**
     * Método para ver un Modelo.pedido
     */
    void verpedido(){

    }

    /**
     * Método para ver los pedidos pendientes
     */
    void listarpedidospendientes(){

    }

    /**
     * Método para ver los pedidos enviados
     */
    void listarpedidosenviados(){

    }

}
