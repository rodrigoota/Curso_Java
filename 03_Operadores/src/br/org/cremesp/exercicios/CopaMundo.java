package br.org.cremesp.exercicios;

import javax.swing.JOptionPane;

public class CopaMundo {

	public static void main(String[] args) {
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual?"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de anos a partir do ano atual?"));
		
		int bissextos = quantidade / 4;
		
		System.out.println(anoAtual);
		System.out.println(quantidade);
		
		if (anoAtual % 4 == 0) {
			bissextos++;
		}
		
		int anoFinal = anoAtual + quantidade;
		
		if(anoFinal % 4 == 0) {
			bissextos++;
		}
		
		String resp = "Ano inicial: " + anoAtual +
				"\nAno Final: " + (anoAtual + quantidade) +
				"\nAnos Bissextos: " + bissextos;
		
		JOptionPane.showMessageDialog(null, resp);
		
	}

}
