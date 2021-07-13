package br.org.cremesp.classes;

public class ElementoInt {
	private int elemento;
	private int[] elementos;
	
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	public int[] getElementos() {
		return elementos;
	}
	public void setElementos(int[] elementos) {
		this.elementos = elementos;
	}
	
	public String listar() {
		String lista = "";
		for (int item : elementos) {
			lista += "Item: " + item + "\r\n";
		}
		return lista;
	}
}
