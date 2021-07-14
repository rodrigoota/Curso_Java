package br.org.cremesp.interfaces;

@FunctionalInterface
public interface Validacao<T> {
	boolean validar(T item);
}
