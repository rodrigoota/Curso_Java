package br.org.cremesp;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int a = 100, b = 30;
		
		boolean b1 = (a >= 90);
		boolean b2 = (a < 50 || b != 50);
		boolean b3 = (a < 50 && b != 50);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("-----------");		
		
		boolean b4 = (a++ > 100 && --b > 0);  //short circuit
		System.out.println(b4);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------");		
		
		boolean b5 = (a > 100 || --b > 0);   //short circuit
		System.out.println(b5);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------");		
		
		boolean b6 = (a < 10 || (--b < 0 && ++a > 0)); //short circuit
		System.out.println(b6);
		System.out.println(a);
		System.out.println(b);
		
	}
}
