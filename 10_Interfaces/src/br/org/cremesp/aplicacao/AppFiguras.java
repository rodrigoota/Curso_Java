package br.org.cremesp.aplicacao;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Circulo;
import br.org.cremesp.classes.Retangulo;
import br.org.cremesp.interfaces.Figura;

public class AppFiguras {
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(10, 5);
		Circulo circulo = new Circulo(2);
		
		Figura figura1 = new Retangulo(3, 3);
		var figura2 = new Circulo(3);
		
		mostrarFigura(retangulo);
		mostrarFigura(circulo);
		mostrarFigura(figura1);
		mostrarFigura(figura2);
	}
	
	private static void mostrarFigura(Figura figura) {
		
//		String classe = figura.getClass().getName();
//		String resultado = "Classe: " + classe +
//				"\r\nÁrea calculada: " + figura.calcularArea();
//		JOptionPane.showMessageDialog(null, resultado);
		
		//utilizando o método dafault da interface
		JOptionPane.showMessageDialog(null, figura.mostrar());
	}

}
