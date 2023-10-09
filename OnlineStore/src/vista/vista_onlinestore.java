package vista;
import java.util.Scanner;
public class vista_onlinestore {

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

    /**
     * Método que muestra el Menú inicial desde el que se escogen:
     * 1. Clientes
     * 2. Artículos
     * 3. Pedidos
     * 0. Salir
     */
    void inicio(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("| Online Store - Menú principal             |");
            System.out.println("+-------------------------------------------+\n");
            System.out.println("1. Clientes");
            System.out.println("2. Artículos");
            System.out.println("3. Pedidos");
            System.out.println("············································");
            System.out.println("0. Salir de la aplicación");
            System.out.println("============================================");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1' -> vista_cliente.clientes();
                case '2' -> vista_articulo.articulos();
                case '3' -> vista_pedido.pedidos();
                case '0' -> salir = true;
            }
        } while (!salir);
    }

}
