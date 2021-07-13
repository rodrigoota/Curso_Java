package br.org.cremesp.interfaces;

//interface funcional só pode ter um método
@FunctionalInterface
public interface Calculo {
	double calcular(double x, double y);
}
