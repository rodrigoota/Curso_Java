package br.org.cremesp.aplicacao.maps;

import java.util.Map;
import java.util.TreeMap;

public class AppMap03 {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new TreeMap<>();
		
		pessoas.put(123, "Marcos");
		pessoas.put(98, "Luciana");
		pessoas.put(450, "Luana");
		pessoas.put(101, "Priscila");
		pessoas.put(123, "Jose");
		
		for (Map.Entry<Integer, String> item : pessoas.entrySet()) {
			System.out.println(item.getKey() + " => " + item.getValue());
		}
		System.out.println();
		
		pessoas.forEach((k, v) -> System.out.println(k + v));
		
		
	}
}
