package br.org.cremesp.interfaces;

public interface Figura {

	/*
	 * em uma interface, os atibutos s�o: 
	 * publicos, estaticos (static) e constantes (final) 
	 * por defini��o
	 */
	String MENSAGEM = "Defini��o da Interface Figura";

	/*
	 * em uma interface, todos os m�todos s�o publicos e abstratos por defini��o
	 */
	double calcularArea();
	
	//m�todo default: disponivel a partir do Java8
	default String mostrar() {
		String classe = this.getClass().getName();
		String resultado = "Classe: " + classe +
				"\r\n�rea calculada: " + this.calcularArea();	

		
		return resultado;
	}
	
	
}
