package br.org.cremesp.aplicacao.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Edvaldo");
		nomes.add("Alessandro");
		nomes.add("Daniela");
		nomes.add("Denys");
		nomes.add("Fabio");
		nomes.add(0, "Pedro");
		nomes.add(2, "Rodrigo");
		
		System.out.println(nomes);
		System.out.println();
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println();
		
		nomes.forEach(p -> System.out.println(p));
		System.out.println();
		
		nomes.forEach(System.out::println);
		System.out.println();
		
		nomes.removeIf(p -> p.startsWith("E"));
		System.out.println();
		nomes.forEach(p -> System.out.println(p));
		
		Collections.sort(nomes);
		System.out.println();
		nomes.forEach(p -> System.out.println(p));
		
	}
}
