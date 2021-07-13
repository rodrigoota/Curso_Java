package br.org.cremesp.classes;

public class ElementoString {
	
	private String elemento;
	private String[] elementos;
	
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public String[] getElementos() {
		return elementos;
	}
	public void setElementos(String[] elementos) {
		this.elementos = elementos;
	}
	
	public String listar() {
		String lista = "";
		for (String item : elementos) {
			lista += "Item: " + item + "\r\n";
		}
		return lista;
	}

}
