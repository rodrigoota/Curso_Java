package br.org.cremesp.aplicacao;

import br.org.cremesp.classes.Retangulo;
import br.org.cremesp.interfaces.CalculoArea;

public class AppCalculoArea {
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(10, 15);
		CalculoArea ca = retangulo::calcularArea;
		System.out.println(ca.calcular());
		
		CalculoArea ca2 = () -> retangulo.calcularArea();
		System.out.println(ca2.calcular());

	}
}
