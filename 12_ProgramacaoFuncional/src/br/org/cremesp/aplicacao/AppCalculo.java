package br.org.cremesp.aplicacao;

import br.org.cremesp.interfaces.Calculo;

public class AppCalculo {
	public static void main(String[] args) {
		
		Calculo c1 = (x, y) -> x + y;  //expressão lambda
		var op1 = c1.calcular(3, 5);
		System.out.println("op1: " + op1);
		
		c1 = (x, y) -> x * y;
		System.out.println(c1.calcular(1, 10));
		
	}
}
