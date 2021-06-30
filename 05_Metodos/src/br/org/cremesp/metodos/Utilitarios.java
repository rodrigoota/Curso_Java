package br.org.cremesp.metodos;

import java.math.BigDecimal;

public class Utilitarios {
	
	//metodo que recebe dois parametros numeroicos e retorna sua soma
	public static double calcularSoma(double x, double y) {
		return x + y;
	}
	
	//metodo que recebe um array de numero reais e retorna sua soma
	//Este método é uma sobrecarga (overloading) do metodo anterior, pois
	//ele possui apenas a lista de parametros como diferença
	public static double calcularSoma(double[] numeros) {
		double soma =0;
		for ( double n : numeros) {
			soma += n;
		}
		//numeros[0] = 100;
		return soma;
	}
	
	//método que recebe uma qtde variavel de parametros
	//o operador '...' se chama varargs (argumentos variaveis)
	public static double calcularSoma(double x, double... numeros) {
		double soma = x;
		for ( double n : numeros) {
			soma += n;
		}
		//numeros[0] = 100;
		return soma;
	}
	
	//esse metodo não é sobre carga pois o tipo de retorno é diferente
	public static BigDecimal calcularSoma(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}
	
	public static String calcularSoma() {
		return "Método 'calcularSoma()'";
	}
	
}
