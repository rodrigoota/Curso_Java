package br.org.cremesp;

public class OperadoresAtribReduzida {

	public static void main(String[] args) {
		int a = 100, b = 30;
		
		a += 3;  // a = 10 + 3 = 103
		b -= 5;  // b = 30 - 5 = 25
		a *= 2;  // a = 103 * 2 = 206
		b /= 3;  // b = 25 / 3 = 8
		a %= 2;  // a = 206 % 2 = 0
		
		System.out.println(a);
		System.out.println(b);

	}

}
