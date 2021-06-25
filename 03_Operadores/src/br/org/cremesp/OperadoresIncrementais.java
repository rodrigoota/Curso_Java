package br.org.cremesp;

public class OperadoresIncrementais {

	public static void main(String[] args) {
		int a = 100, b = 30;
		
		a++;
		++b;
		
		System.out.println(a);
		System.out.println(b);
		
		
		//usando os operadores incrementais em conjunto com outras operações
		int resp1 = a--;
		int resp2 = --b;
		
		System.out.println("------");
		System.out.println("a: " + a + ", resp1: " + resp1);
		System.out.println("b: " + b + ", resp1: " + resp2);

		System.out.println("Novo valor de a: " + a++); //depois dessa instrução a = 101
		System.out.println("Novo valor de b: " + ++b);
		
		System.out.println("Valor atual de a: " + a);
		System.out.println("Valor atual de b: " + b);
	}

}
