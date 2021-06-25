package br.org.cremesp;

public class OperadorTernario {

	public static void main(String[] args) {
		
		int ano = 2021;
		
		int dias = ano % 4 == 0 ? 366 : 365;
		
		System.out.println("O ano " + ano + " possui " + dias + " dias");

	}

}
