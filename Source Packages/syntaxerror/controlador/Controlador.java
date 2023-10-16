package syntaxerror.controlador;

import syntaxerror.modelo.Articulo;
import syntaxerror.modelo.Cliente;
import syntaxerror.modelo.Datos;
import syntaxerror.modelo.Pedido;

public class Controlador {
	private Datos datos;

    // Constructor
    public Controlador() {
        this.datos = new Datos();
    }

    // Métodos que intervienen entre la vista y el modelo
   
    //Articulo
    public void agregarArticulo(Articulo articulo) {
        datos.agregarArticulo(articulo);
    }

    public void eliminarArticulo(Articulo articulo) {
        datos.eliminarArticulo(articulo);
    }

    public Articulo obtenerArticulo(int indice) {
        return datos.obtenerArticulo(indice);
    }

    public int getTamArticulos() {
        return datos.tamArticulos();
    }
    
    //Cliente
    public void agregarCliente(Cliente cliente) {
        datos.agregarCliente(cliente);
    }
    
    public void eliminarCliente(Cliente cliente) {
    	datos.eliminarCliente(cliente);
    }
    
    public Cliente obtenerCliente(int indice) {
    	return datos.obtenerCliente(indice);
    }

    public int getTamCliente() {
    	return datos.tamClientes();
    }
    
    //Pedido
    public void agregarPedido(Pedido pedido) {
    	datos.agregarPedido(pedido);
    }
    
    public void eliminarPedido(Pedido pedido) {
    	datos.eliminarPedido(pedido);
    }
    
    public Pedido obtenerPedido(int indice) {
    	return datos.obtenerPedido(indice);
    }
    
    public int getTamPedido() {
    	return datos.tamPedidos();
    }
}
