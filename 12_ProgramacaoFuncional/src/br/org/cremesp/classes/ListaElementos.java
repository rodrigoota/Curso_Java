package br.org.cremesp.classes;

import br.org.cremesp.interfaces.Validacao;

public class ListaElementos<T> {
	
	private T[] elementos;
	
	public ListaElementos(T[] elementos) {
		this.elementos = elementos;
	}

	public T[] getElementos() {
		return elementos;
	}
	
	//metodo que recebe como parametro um "criterio" de busca e retorna o
	//primeiro elemento que atende àquele criterio
	public T buscar(Validacao<T> valida) {
		for (T item : elementos) {
			if (valida.validar(item)) {
				return item;
			}
		}
		return null;
	}

}
