package br.org.cremesp.aplicacao;

import br.org.cremesp.classes.Circulo;
import br.org.cremesp.classes.ListaElementos;
import br.org.cremesp.classes.Retangulo;
import br.org.cremesp.interfaces.Figura;

public class AppListaElementos {
	public static void main(String[] args) {
		
		String[] nomes = {"Edvaldo","Alessandro","Daniela","Pedro","Rodrigo","Denys"};
		ListaElementos<String> le = new ListaElementos<>(nomes);
		
		var itemEncontrado = le.buscar(p -> p.contains("y"));
		System.out.println("Item encontrado: " +  itemEncontrado);
		
		
		Figura[] figuras = {new Retangulo(3,4), new Retangulo(1,2), new Circulo(1)};
		ListaElementos<Figura> lef = new ListaElementos<Figura>(figuras);
		
		var figuraEncontrada = lef.buscar(p -> p.calcularArea() > 3);
		System.out.println(figuraEncontrada != null ? figuraEncontrada.mostrar() : "Figura inexistente");
		
		
	}
}
