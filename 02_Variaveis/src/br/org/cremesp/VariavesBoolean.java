package br.org.cremesp;

public class VariavesBoolean {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		int valor = 100;
		boolean b3 = valor > 10;
		
		//usando operadores lógicos
//		boolean b4 = (valor > 10 && b2 == false);
//		boolean b5 = (valor > 10 && b1 == true);
		boolean b4 = (valor > 10 && !b2);    //&& -> AND lógico
		boolean b5 = (valor > 10 && b1);
		
		boolean b6 = (valor == 18 || b1);    //|| -> OR lógico
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println("b3: " + b3);
		System.out.println("b4: " + b4);
		System.out.println("b5: " + b5);
		System.out.println("b6: " + b6);
	}

}
