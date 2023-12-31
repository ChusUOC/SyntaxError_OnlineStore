package syntaxerror.modelo;

import java.util.ArrayList;

public class Lista<T> {
	protected ArrayList<T> lista;
	
	public Lista() {
		lista = new ArrayList<>();
	}
	
	// Agregar un elemento a la lista
	public void agregar(T elemento) {
		lista.add(elemento);
	}
	
	//Eliminar un elemento de la lista
	public void eliminar(T elemento) {
		lista.remove(elemento);
	}
	
	//Obtener el tamaño de la lista
	public int tamanio() {
		return lista.size();
	}
	
	//Obtener un elemento por el indice
	public T obtener(int indice) {
		return lista.get(indice);
	}
}
