package br.org.cremesp;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int a = 100, b = 30;
		
		//div inteira
		int resp = a / b;
		int resto =a % b;
		System.out.println(resp);
		System.out.println(resto);
		
		double resposta2 = a / b;
		System.out.println(resposta2);
		
		//forçando uma div real a partir de numeros inteiros
		double resposta3 = a / (double) b;
		System.out.println(resposta3);
		

	}

}
