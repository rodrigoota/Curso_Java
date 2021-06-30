package br.org.cremesp.aplicacao;

import java.math.BigDecimal;

import br.org.cremesp.metodos.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		double soma1 = Utilitarios.calcularSoma(0.1, 0.2);
		System.out.println("Soma1: " + soma1);
		
		double[] valores = {3 , 5, 8.4, 9.2, 7};
		System.out.println("Soma2: " + Utilitarios.calcularSoma(valores));
		for (double d : valores) {
			System.out.println(d);
		}
		
		double soma3 = Utilitarios.calcularSoma(new double[] {});		
		double soma4 = Utilitarios.calcularSoma(5);		
		double soma5 = Utilitarios.calcularSoma(2, 7, 9, 3.5, 1);		
		double soma6 = Utilitarios.calcularSoma(5, valores);		
		
		
		System.out.println("Soma3: " + soma3);
		System.out.println("Soma4: " + soma4);
		System.out.println("Soma5: " + soma5);
		System.out.println("Soma6: " + soma6);
		
		
		BigDecimal b1 = new BigDecimal("0.2"); //boas praticas é passar o valor em String
		BigDecimal b2 = new BigDecimal("0.1");
		System.out.println("Soma utilizando BigDecimal: " + Utilitarios.calcularSoma(b1, b2));
		
		
		System.out.println(Utilitarios.calcularSoma());
		
	}
}
