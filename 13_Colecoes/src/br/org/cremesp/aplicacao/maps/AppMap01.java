package br.org.cremesp.aplicacao.maps;

import java.util.HashMap;
import java.util.Map;

public class AppMap01 {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(123, "Marcos");
		pessoas.put(98, "Luciana");
		pessoas.put(450, "Luana");
		pessoas.put(101, "Priscila");
		pessoas.put(123, "Jose");
		
		for (Map.Entry<Integer, String> item : pessoas.entrySet()) {
			System.out.println(item.getKey() + " => " + item.getValue());
		}
		
	}
}
