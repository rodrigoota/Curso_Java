package br.org.cremesp;

public class IntroducaoArrays {

	public static void main(String[] args) {
		//arrays de inteiros
		int[] valores = {2, 3, 5, 8};
		
		int[] numeros;
		numeros = new int[]{2,3,5,8};
		

		//exibindo valores
		System.out.println(valores);
		System.out.println(numeros);
		
		System.out.println(valores[2]);
		System.out.println(numeros[0]);
		
		//array de numeros reais, cujo elementos serão atribuidos posteriormente
		double[] numerosAleatorios = new double[5];
		
		numerosAleatorios[0] = Math.random();
		numerosAleatorios[1] = Math.random();
		numerosAleatorios[2] = Math.random();
		numerosAleatorios[3] = Math.random();
		numerosAleatorios[4] = Math.random();

		
		System.out.println(numerosAleatorios[0]);
		System.out.println(numerosAleatorios[1]);
		System.out.println(numerosAleatorios[2]);
		System.out.println(numerosAleatorios[3]);
		System.out.println(numerosAleatorios[4]);

		
		
	}

}
