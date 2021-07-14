package br.org.cremesp.aplicacao.conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class AppSet03 {
	public static void main(String[] args) {
		
		Set<String> nomes = new TreeSet<>(); //Já insere itens ordenados pelo compareTo
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
