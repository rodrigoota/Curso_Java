package br.org.cremesp;

public class VariaveisInteiras {

	public static void main(String[] args) {
		//Variaveis inteiras
		int quantidade = 10;
		System.out.println("quantidade: " + quantidade);
		
		//concatenando variaveis
		/*
		 * Neste exemplo vamos apresentar a soma entre inteiros, concatenada a um texto.
		 * */
		int v1 = 5, v2 = 6, v3 = 7;		
		System.out.println("Soma total: " + v1 + v2 + v3);
		System.out.println("Soma total: " + (v1 + v2 + v3));
		System.out.println(v1 + v2 + v3 + " = Soma total");
		
		//bases numéricas
		int numero = 120;
		System.out.println("Base decimal: " + numero);
		
		numero = 0120; //base octal (0 a 7)
		System.out.println("Base octal -> decimal: " + numero);
		
		numero = 0x120; //base hexadecimal (0-9, a-f)
		System.out.println("Base hexadecimal -> decimal: " + numero);
		
		numero = 0b1110; //base binaria (0 ou 1)
		System.out.println("Base binaria -> decimal: " + numero);
		
		

	}

}
