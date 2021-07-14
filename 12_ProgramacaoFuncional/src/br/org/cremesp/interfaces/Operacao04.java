package br.org.cremesp.interfaces;

@FunctionalInterface
public interface Operacao04<T, E extends T> {
	E executar(T item);
}
