package br.org.cremesp.metodos;

import java.math.BigDecimal;

public class Utilitarios {
	
	//metodo que recebe dois parametros numeroicos e retorna sua soma
	public static double calcularSoma(double x, double y) {
		return x + y;
	}
	
	//metodo que recebe um array de numero reais e retorna sua soma
	//Este m�todo � uma sobrecarga (overloading) do metodo anterior, pois
	//ele possui apenas a lista de parametros como diferen�a
	public static double calcularSoma(double[] numeros) {
		double soma =0;
		for ( double n : numeros) {
			soma += n;
		}
		//numeros[0] = 100;
		return soma;
	}
	
	//m�todo que recebe uma qtde variavel de parametros
	//o operador '...' se chama varargs (argumentos variaveis)
	public static double calcularSoma(double x, double... numeros) {
		double soma = x;
		for ( double n : numeros) {
			soma += n;
		}
		//numeros[0] = 100;
		return soma;
	}
	
	//esse metodo n�o � sobre carga pois o tipo de retorno � diferente
	public static BigDecimal calcularSoma(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}
	
	public static String calcularSoma() {
		return "M�todo 'calcularSoma()'";
	}
	
}
