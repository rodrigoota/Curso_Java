package br.org.cremesp.aplicacao.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<>(); //mais eficiente q arraylist na hora de inserir e remover
		
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

		nomes.forEach(System.out::println);
		
	}
}
