package br.org.cremesp.exercicios;

import javax.swing.JOptionPane;

public class AdivinhaNumero {
	public static void main(String[] args) {
		
		int numeroGerado = (int) (Math.random() * 101);
		//System.out.println(numeroGerado);
		int tentativas = 0;
		int num =0, min = 0, max = 100;
		
		while(true) {
			tentativas++;
			num = Integer.parseInt(JOptionPane.showInputDialog("Informar um valor entre " + min + " e " + max));
			System.out.println("Tentativa " + tentativas + ": " + num);
			if (num == numeroGerado) {
				break;
			}
			if (num < min || num > max) {
				continue;
			}
			if (num < numeroGerado) {
				min = num + 1;
			} else if (num > numeroGerado) {
				max = num - 1;
			}			
		}
		
		String resposta = "Acertou! Numero gerado: " + numeroGerado
				+ "\nTentativas para acertar: " + tentativas;
		
		JOptionPane.showInternalMessageDialog(null, resposta);		
				
		
	}
}
