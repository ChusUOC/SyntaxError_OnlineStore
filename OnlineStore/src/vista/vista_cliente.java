package vista;
import java.util.Scanner;
public class vista_cliente {

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

    static void clientes(){
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
    void nuevocliente(){

    }

    /**
     * Dar de baja a un Modelo.cliente de la BBDD
     */
    void borrarcliente(){

    }

    /**
     * Ver una ficha del Modelo.cliente
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

}
