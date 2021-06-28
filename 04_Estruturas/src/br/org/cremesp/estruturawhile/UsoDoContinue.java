package br.org.cremesp.estruturawhile;

import javax.swing.JOptionPane;

public class UsoDoContinue {

	public static void main(String[] args) {
		/*
		 * Neste exemplo, o usu�rio informar� uma certa quantidade de n�meros inteiros.
		 * Se o numero informado for zero, a estrutura � interrompida.
		 */
		while (true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informar um n�mero"));
			if (numero == 0) {
				break; //sai do while
			}
			if(numero < 0) {
				continue; //volta pro while, ignorando as pr�ximas instru��es
			}
			System.out.println("N�mero informado: " + numero);
		}
		System.out.println("---- FIM ----");		
	}

}
