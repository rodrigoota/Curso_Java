package br.org.cremesp.aplicacao;

import br.org.cremesp.classes.Metodos;
import br.org.cremesp.interfaces.Calculo;

public class AppMetodos {
	public static void main(String[] args) {
		
		Calculo calc = Metodos::calcularSoma;
		
		Calculo calc2 = (x, y) -> Metodos.calcularSoma(x, y);
		
		System.out.println(calc.calcular(3, 3));
		
		System.out.println(calc2.calcular(2, 6));
		
	}
}
