package br.org.cremesp.entradas;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		
		//Entradas de dados usando a classe JOptionPane
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		System.out.println(nome);
		
		//String nome = JOptionPane.showInputDialog("Informe seu nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		System.out.println(idade);
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		System.out.println(altura);
		
		String resposta = "Nome: " + nome +
				"\r\nIdade: " + idade +
				"\r\nAltura: " + altura;
		
		JOptionPane.showMessageDialog(null, resposta);
				
		


	}

}
