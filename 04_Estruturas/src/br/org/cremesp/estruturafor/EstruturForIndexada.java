package br.org.cremesp.estruturafor;

public class EstruturForIndexada {
	public static void main(String[] args) {
		
		double[] numerosAleatorios = new double[5];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = Math.random() * 10;
			System.out.println((int)(numerosAleatorios[i]));			
		}
	}
}
