package OnlineStore.vista;
import java.util.Scanner;
public class vista {


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
                case '1' -> clientes();
                case '2' -> articulos();
                case '3' -> pedidos();
                case '0' -> salir = true;
            }
        } while (!salir);
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


    /**
     * Menú de artículos
     */
    void articulos(){
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


    void clientes(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("| Online Store - Menú Clientes              |");
            System.out.println("+-------------------------------------------+\n");
            System.out.println("1. Nuevo Modelo.cliente");
            System.out.println("2. Borrar Modelo.cliente");
            System.out.println("3. Ver Modelo.cliente");
            System.out.println("4. Listado clientes Standard");
            System.out.println("5. Listado clientes Premium");
            System.out.println("············································");
            System.out.println("0. Volver al menú principal");
            System.out.println("============================================");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1' -> nuevocliente();
                case '2' -> borrarcliente();
                case '3' -> vercliente();
                case '4' -> listarclientepestandard();
                case '5' -> listarclientepremium();
                case '0' -> salir = true;
            }
        } while (!salir);
    }


    /**
     * Añadir un nuevo Modelo.cliente a la BBDD
     */
    static void nuevocliente(){

    }

    /**
     * Dar de baja a un Modelo.cliente de la BBDD
     */
    static void borrarcliente(){

    }

    /**
     * Ver una ficha del Modelo.cliente
     */
    static void vercliente(){

    }

    /**
     * Listar clientes estandard de Online Store
     */
    static void listarclientepestandard(){

    }

    /**
     * Listar clientes premium de Online Store
     */
    static void listarclientepremium(){

    }

}
