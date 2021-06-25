package br.org.cremesp.wrapper;

public class ClassesWrapper {

	public static void main(String[] args) {
		
		Integer n1 = 100;
		int n2 = n1;       //autounboxing ou unboxing
		
		int n3 = 200;
		Integer n4 = n3;   //autoboxing ou boxing
		
		Double d1 = 100.2;
		Float f1 = 100.2f;
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
		System.out.println("d1: " + d1);
		System.out.println("f1: " + f1);
		n1 = null;
		System.out.println("n1: " + n1);
		
	}

}
