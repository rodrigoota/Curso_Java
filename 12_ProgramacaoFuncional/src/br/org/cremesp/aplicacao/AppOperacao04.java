package br.org.cremesp.aplicacao;

import br.org.cremesp.classes.Circulo;
import br.org.cremesp.classes.Retangulo;
import br.org.cremesp.interfaces.Figura;
import br.org.cremesp.interfaces.Operacao04;

public class AppOperacao04 {
	public static void main(String[] args) {
		
		Operacao04<Figura, Retangulo> op1 = p -> (Retangulo)p; // new Retangulo(5,7);

		
		Operacao04<Figura, Figura> op2 = p -> p; // new Circulo(3);
		
		Operacao04<Figura, Figura> op3 = p -> new Figura() {
			//dados do triangulo - classe anonima
			private double base = 10;
			private double altura = 20;
			@Override
			public double calcularArea() {
				return (base * altura) / 2;
			}
		};
		
		Figura f = new Retangulo(5,7);
		System.out.println("op1: " + op1.executar(f).mostrar());
		System.out.println();
		
		Figura c = new Circulo(3);
		System.out.println("op2: " + op2.executar(c).mostrar());
		System.out.println();
		
		//triangulo criado na classe anonima
		System.out.println("op3: " + op3.executar(null).mostrar());
		
	}
}
