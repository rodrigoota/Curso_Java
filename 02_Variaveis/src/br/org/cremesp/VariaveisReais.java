package br.org.cremesp;

public class VariaveisReais {

	public static void main(String[] args) {
		
		float f1 = 100;
		double d1 = 100;
		System.out.println("f1: " + f1);
		System.out.println("d1: " + d1);
		
		//float f2 = 100.1F;
		float f2 = (float) 100.1;   //typecast
		double d2 = 100.1;
		float f3 = (float) d2;    //typecast: unica opção
		
		System.out.println("f2: " + f2);
		System.out.println("d2: " + d2);
		System.out.println("f3: " + f3);
		
		//obtendo a parte inteira de um numero real
		double d3 = 100.99;
		int n1 = (int) d3;
		
		System.out.println("n1: " + n1);
		
	}

}
