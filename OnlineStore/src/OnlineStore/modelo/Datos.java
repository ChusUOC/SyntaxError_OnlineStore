package OnlineStore.modelo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Datos {
    private ListaArticulos listaArticulos;
    private ListaClientes listaClientes;
    private ListaPedidos listaPedidos;


    public Datos (){
        listaArticulos = new ListaArticulos();
        listaClientes = new ListaClientes();
        listaPedidos = new ListaPedidos ();
    }

    public void addArticulo(articulo Articulo){

        this.listaArticulos.add(Articulo);
    }

    public void dropArticulo(int Indice){
        listaArticulos.borrar(listaArticulos.getAt(Indice));
    }

    public void viewArticulos(){
        listaArticulos.mostrartodo();
    }


    public void dropcliente(int Indice){
        listaClientes.borrar(listaClientes.getAt(Indice));
    }
    public void addClientePremium(cliente_premium Cliente){
        this.listaClientes.add(Cliente);
    }

    public void addClienteEstandard(cliente_estandard Cliente){
        this.listaClientes.add(Cliente);
    }

    public void viewClientes(){
        System.out.println("-------------------------------------");
        System.out.println("| LISTADO DE CLIENTES COMPLETO       ");
        System.out.println("-------------------------------------\n");
        listaClientes.mostrartodo();
    }

    public void viewClientesPorTipo(String Tipo){
        System.out.println("-------------------------------------");
        System.out.println("| LISTADO DE CLIENTES TIPO : " + Tipo);
        System.out.println("-------------------------------------\n");
        for ( cliente C: listaClientes.getArrayList()){
            if(C.tipoCliente().equals(Tipo)){
                System.out.println(C.toString());
            }
        }
    }

    public cliente getClienteporIndice(int Indice){
        if (Indice>=0 || Indice <= listaClientes.getSize()){
            return listaClientes.getAt(Indice);
        }else{
            System.out.println("Índice fuera de rango");
            return null;
        }
    }

    public articulo getArticuloporIndice (int Indice){
        if (Indice>=0 || Indice <= listaArticulos.getSize()){
            return listaArticulos.getAt(Indice);
        }else{
            System.out.println("Índice fuera de rango");
            return null;
        }
    }

    public void listaclienteindice(){
        System.out.println("| Índice\t Nombre Cliente \t Tipo Cliente");
        for (int i = 0; i < listaClientes.getSize(); i++){
            System.out.print("|" + i + "\t\t");
            System.out.print( " " + String.format("%-20s", listaClientes.getAt(i).getNombre()) + "\t");
            System.out.println( " " + String.format("%-20s",listaClientes.getAt(i).tipoCliente()) );
        }
    }

    public void listaarticuloindice(){
        System.out.println("Índice\t Artículo  \t Descripción");
        for (int i = 0; i < listaArticulos.getSize(); i++){
            System.out.print("|" + i + "\t\t");
            System.out.print(" " + String.format("%-10s",listaArticulos.getAt(i).getCodigo()) + "\t");
            System.out.println(" " + String.format("%-20s",listaArticulos.getAt(i).getDescripcion()) );
        }
    }

    public void addPedido(pedido Pedido){
        listaPedidos.add(Pedido);
    }

    public void dropPedido(int Indice){
        listaPedidos.borrar(listaPedidos.getAt(Indice));
    }

    public boolean checkmail(String correo){
        for (int i = 0; i < listaClientes.getSize(); i++) {
            if (listaClientes.getAt(i).getMail().equals(correo)) {
                return true;  // Si se encuentra el correo, se devuelve true
            }
        }
        return false;  // Si no se encuentra el correo, se devuelve false
    }

    public int maximopedidos(){
        return listaPedidos.getSize();
    }
    public void listapedidoindice(){
        System.out.println("Índice \t Nº Pedido \t Fecha \t Hora \t Unidades" );
        for (int i=0; i< listaPedidos.getSize(); i++){
            System.out.print(i + "\t");
            System.out.print(String.format("%-10s",listaPedidos.getAt(i).getNumpedido()) + "\t");
            System.out.print(String.format("%-10s",listaPedidos.getAt(i).getFechapedido()) + "\t");
            System.out.print(String.format("%-10s",listaPedidos.getAt(i).getHorapedido()) + "\t");
            System.out.println(" " + String.format("%-5s",listaPedidos.getAt(i).getUnidades()) );
        }
    }

    public void ListadodePedidos(boolean pendiente){
        double subtotal;
        double descuento;
        double total;
        LocalTime TiempoPreparacionPedido;

        System.out.println("Índice \t Estado \t Nº Pedido \t Fecha \t\t Hora \t Hora Entrega \t Unidades \t Subtotal \t TOTAL" );

        for (int i = 0; i < listaPedidos.getSize(); i++){
            pedido Pedido = listaPedidos.getAt(i);

            if (Pedido.pedidoEnviado()==pendiente){
                String estado = pendiente ? "Pendiente" : "Enviado";
                System.out.print(i + "\t\t" + estado + "\t");
                System.out.print(" " + String.format("%-10s",Pedido.getNumpedido()) + "\t");
                System.out.print(" " + String.format("%-10s",Pedido.getFechapedido()) + "\t");
                System.out.print(" " + String.format("%-10s",Pedido.getHorapedido()) + "\t");
                System.out.print(" " + String.format("%-10s",Pedido.tiempoentrega()) + "\t\t");
                System.out.print(" " + String.format("%-5s",Pedido.getUnidades()) );
                subtotal = (Pedido.getArticulo().getPrecioventa() * Pedido.getUnidades()) + Pedido.getArticulo().getGastosenvio();
                total = (subtotal - Pedido.getCliente().descuentoEnv());

                System.out.print(" " + subtotal);
                System.out.println(" " + total);
                System.out.print("CLIENTE  : " + Pedido.getCliente());
                System.out.print("ARTÍCULO : " + Pedido.getArticulo());
                System.out.println("-----------------------------------------------------------------------------------");

            }
        }
    }


    public boolean validarNIF(String nif){
        boolean status = false;
        nif = nif.trim().toUpperCase();
        if (nif.length() != 9){
            status = false;
        }
        String numero = nif.substring(0, 8);
        char letraControl = nif.charAt(8);

        // Comprobar que el número es numérico
        if (!numero.matches("[0-9]+")) {
            return false;
        }

        // Calcular la letra de control esperada
        char letraEsperada = calcularLetraControl(Integer.parseInt(numero));

        // Comparar la letra de control esperada con la proporcionada
        return letraControl == letraEsperada;

    }

    private static char calcularLetraControl(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(numero % 23);
    }

    public static boolean mailok(String email) {
        String patronEmail = "^[A-Za-z0-9+_.-]+@(.+)$";

        // Compilar el patrón
        Pattern pattern = Pattern.compile(patronEmail);

        // Crear un objeto Matcher
        Matcher matcher = pattern.matcher(email);

        // Verificar si la cadena cumple con el patrón
        return matcher.matches();
    }

}
