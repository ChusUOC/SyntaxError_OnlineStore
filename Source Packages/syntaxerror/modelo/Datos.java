package syntaxerror.modelo;

public class Datos {
	    private ListaArticulos listaArticulos;
	    private ListaClientes listaClientes;
	    private ListaPedidos listaPedidos;

	    // Constructor
	    public Datos() {
	        listaArticulos = new ListaArticulos();
	        listaClientes = new ListaClientes();
	        listaPedidos = new ListaPedidos();
	    }
	    
	    // Métodos para gestionar Artículos
	    public void agregarArticulo(Articulo articulo) {
	    	listaArticulos.agregar(articulo);
	    }
	    
	    public void eliminarArticulo(Articulo articulo) {
	    	listaArticulos.eliminar(articulo);
	    }
	    
	    public Articulo obtenerArticulo(int indice) {
	        return listaArticulos.obtener(indice);
	    }

	    public int tamArticulos() {
	        return listaArticulos.tamanio();
	    }
	    
	    // Métodos para gestionar Clientes
	    public void agregarCliente(Cliente cliente) {
	        listaClientes.agregar(cliente);
	    }

	    public void eliminarCliente(Cliente cliente) {
	        listaClientes.eliminar(cliente);
	    }

	    public Cliente obtenerCliente(int indice) {
	        return listaClientes.obtener(indice);
	    }

	    public int tamClientes() {
	        return listaClientes.tamanio();
	    }
	    
	    // Métodos para gestionar Pedidos
	    public void agregarPedido(Pedido pedido) {
	        listaPedidos.agregar(pedido);
	    }

	    public void eliminarPedido(Pedido pedido) {
	        listaPedidos.eliminar(pedido);
	    }

	    public Pedido obtenerPedido(int indice) {
	        return listaPedidos.obtener(indice);
	    }

	    public int tamPedidos() {
	        return listaPedidos.tamanio();
	    }
	    
}
