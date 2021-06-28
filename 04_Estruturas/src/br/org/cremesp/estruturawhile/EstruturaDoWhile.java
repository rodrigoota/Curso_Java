package br.org.cremesp.estruturawhile;

public class EstruturaDoWhile {
	
	public static void main(String[] args) {
		
		int numero = (int) (Math.random() * 10); // inteiro entre 0 e 9
		
		do {
			System.out.println("numero: " + numero++);			
		} while(numero < 5);
		
		System.out.println("-----Fim-------");

	}
}
