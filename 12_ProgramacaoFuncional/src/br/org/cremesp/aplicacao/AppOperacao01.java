package br.org.cremesp.aplicacao;

import br.org.cremesp.interfaces.Operacao01;

public class AppOperacao01 {
	public static void main(String[] args) {
		
		Operacao01 op1 = x -> x % 2 == 0 ? "par" : "impar";

//		public String executar(int x) {
//			return x % 2 == 0 ? "par" : "impar"; 
//		}		
		System.out.println(op1.executar(11));

		
		Operacao01 op2 = p -> {
			if (p % 2 == 0) {
				return "par";
			} else {
				return "impar";
			}
		};
		
		System.out.println(op2.executar(11));
		
	}
		
}
