package br.org.cremesp.estruturawhile;

import javax.swing.JOptionPane;

public class UsoDoContinue {

	public static void main(String[] args) {
		/*
		 * Neste exemplo, o usuário informará uma certa quantidade de números inteiros.
		 * Se o numero informado for zero, a estrutura é interrompida.
		 */
		while (true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informar um número"));
			if (numero == 0) {
				break; //sai do while
			}
			if(numero < 0) {
				continue; //volta pro while, ignorando as próximas instruções
			}
			System.out.println("Número informado: " + numero);
		}
		System.out.println("---- FIM ----");		
	}

}
