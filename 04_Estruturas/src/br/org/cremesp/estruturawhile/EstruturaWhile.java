package br.org.cremesp.estruturawhile;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		int numero = (int) (Math.random() * 10); // inteiro entre 0 e 9
		
		while(numero < 5) {
			System.out.println("numero: " + numero++);
		}
		System.out.println("-----Fim-------");

	}

}
