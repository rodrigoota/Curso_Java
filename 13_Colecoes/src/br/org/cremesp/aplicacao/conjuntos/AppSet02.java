package br.org.cremesp.aplicacao.conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet02 {
	public static void main(String[] args) {
		
		Set<String> nomes = new LinkedHashSet<>(); //lista encadeada
		nomes.add("Edvaldo");
		nomes.add("Alessandro");
		nomes.add("Daniela");
		nomes.add("Denys");
		nomes.add("Fabio");
		nomes.add("Emilio");
		nomes.add("Pedro");
		nomes.add("Rodrigo");
		nomes.add("Rodrigo"); //Set não permite itens duplicados, somente itens exclusivos
		
		nomes.forEach(s -> System.out.println(s + " - Hash: " + s.hashCode()));

	}
}
