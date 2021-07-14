package br.org.cremesp.aplicacao;

import br.org.cremesp.interfaces.Validacao;

public class AppValidacao {
	public static void main(String[] args) {
		
		Validacao<String> op1 = p -> p.startsWith("a");
		
		boolean resposta = op1.validar("amizade");
	
		System.out.println("resposta: " + resposta);
		
	}
}
