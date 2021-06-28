package br.org.cremesp.exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class NomesInformados {

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informar a quantidade de nomes"));
		
		String[] nomes = new String[quantidade];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Fornecer o nome " + (i + 1));
		}
		
		//colocando os nomes em ordem
		Arrays.sort(nomes);
		
		//variaveis para as quantidade solicitadas no exercício
		int iniciaComA = 0;
		int possuiMaisQue10Char = 0;
		int temSobrenomeSilva = 0;
		
		//apresentando os nomes para o usuário
		for (String nome : nomes) {
			
			if(nome.toUpperCase().startsWith("A")) {
				iniciaComA++;
			}
			if (nome.replace(" ","").length() > 10) {
				possuiMaisQue10Char++;
			}
			int n = nome.lastIndexOf(' ');
			if(n >= 0) {
				if (nome.substring(n + 1).equalsIgnoreCase("Silva")) {
					temSobrenomeSilva++;
				}
			}
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + nome.substring(n + 1));
		}
		
		String resposta = "Inicia com A: " + iniciaComA
				+ "\nPossui mais que 10 caracteres: " + possuiMaisQue10Char
				+ "\nTem sobrenome 'Silva': " + temSobrenomeSilva;
		
		JOptionPane.showInternalMessageDialog(null, resposta);
		
	}

}
