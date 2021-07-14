package br.org.cremesp.interfaces;

public interface Figura {

	/*
	 * em uma interface, os atibutos são: 
	 * publicos, estaticos (static) e constantes (final) 
	 * por definição
	 */
	String MENSAGEM = "Definição da Interface Figura";

	/*
	 * em uma interface, todos os métodos são publicos e abstratos por definição
	 */
	double calcularArea();
	
	//método default: disponivel a partir do Java8
	default String mostrar() {
		String classe = this.getClass().getName();
		String resultado = "Classe: " + classe +
				"\r\nÁrea calculada: " + this.calcularArea();	

		
		return resultado;
	}
	
	
}
