package br.org.cremesp.exercicios;

import javax.swing.JOptionPane;

public class ContagemNumeros {
	public static void main(String[] args) {
		int contadorPos = 0, contadorNeg = 0;
		double soma = 0;
		
		while (true) {
			double numero = Double.parseDouble(JOptionPane.showInputDialog("Informar um número"));
			if (numero == 0) {
				break; //sai do while
			}
			if(numero < 0) {
				contadorNeg++;
				continue; //volta pro while, ignorando as próximas instruções
			}
			contadorPos++;
			soma += numero;
			System.out.println("Número informado: " + numero);
		}
		
		double media = (contadorPos > 0) ? soma / contadorPos : 0;
						
		String resposta = "Qtde de numeros positivos: " + contadorPos
				+ "\nQtde de numeros negativos: " + contadorNeg
				+ "\nSoma dos numeros positivos: " + soma
				+ ((contadorPos > 0) ? "\nMédia dos numeros positivos: " + media : 
					"\nNão Foram informados positivos para calcular a média.");
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
