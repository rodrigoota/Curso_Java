package br.org.cremesp.interfaces;

public interface AcessoDados<T, K> {
	
	void incluir(T item);
	T buscar(K id);

}
