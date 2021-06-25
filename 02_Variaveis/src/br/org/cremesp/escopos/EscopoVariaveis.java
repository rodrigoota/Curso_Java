package br.org.cremesp.escopos;

public class EscopoVariaveis {

	public static void main(String[] args) {
		
		int n1 = 100;
		{
			int n2 = 200;
			System.out.println("n1 (bloco interno): " + n1);
			System.out.println("n1 (bloco interno): " + n2);
		}
		System.out.println("n1 (fora do bloco): " + n1);
		//System.out.println("n2 (fora do bloco): " + n2);
	}

}
