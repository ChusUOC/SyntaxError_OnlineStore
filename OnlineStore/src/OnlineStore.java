import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    void clientes(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("| Online Store - Menú Clientes              |");
            System.out.println("+-------------------------------------------+\n");
            System.out.println("1. Nuevo cliente");
            System.out.println("2. Borrar cliente");
            System.out.println("3. Ver cliente");
            System.out.println("4. Listado clientes Estandard");
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
     * Añadir un nuevo cliente a la BBDD
     */
    void nuevocliente(){

    }

    /**
     * Dar de baja a un cliente de la BBDD
     */
    void borrarcliente(){

    }

    /**
     * Ver una ficha del cliente
     */
    void vercliente(){

    }

    /**
     * Listar clientes estandard de Online Store
     */
    void listarclientepestandard(){

    }

    /**
     * Listar clientes premium de Online Store
     */
    void listarclientepremium(){

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
    void nuevoarticulo(){

    }

    /**
     * Borrar un artículo existente en la BBDD de Online Store
     */
    void borrararticulo(){

    }

    /**
     * Listar artículos existentes en la BBDD de Online Store
     */
    void listararticulos(){

    }
    
    void pedidos(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("| Online Store - Menú Pedidos               |");
            System.out.println("+-------------------------------------------+\n");
            System.out.println("1. Crear un pedido");
            System.out.println("2. Eliminar un pedido");
            System.out.println("3. Ver un pedido");
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
     * Método para eliminar un pedido
     */
    void eliminarpedido(){

    }
    
    /**
     * Método para ver un pedido
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
