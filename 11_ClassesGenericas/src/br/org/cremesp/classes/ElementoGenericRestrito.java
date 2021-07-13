package br.org.cremesp.classes;

//public class ElementoGenericRestrito<T extends Number> {
public class ElementoGenericRestrito<T extends Comparable<T>> {
	
	private T elemento;
	private T[] elementos;
	
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public T[] getElementos() {
		return elementos;
	}
	public void setElementos(T[] elementos) {
		this.elementos = elementos;
	}
	
	public String listar() {
		String lista = "";
		for (T item : elementos) {
			lista += "Item: " + item + "\r\n";
		}
		return lista;
	}
}
