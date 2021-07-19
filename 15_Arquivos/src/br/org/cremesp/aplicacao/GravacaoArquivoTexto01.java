package br.org.cremesp.aplicacao;

import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GravacaoArquivoTexto01 {
	public static void main(String[] args) {
		//Gravando arquivo texto
		try {
			FileWriter writer = new FileWriter("J:\\Cursos\\Java\\arquivos\\nomes.txt", true);		
			
			ArrayList<String> listaNomes = new ArrayList<>();
			listaNomes.add("Peter");
			listaNomes.add("Jefferson");
			listaNomes.add("Mariana");
			listaNomes.add("Priscila");
			listaNomes.add("Ana Maria");
			
			
			for (String nome : listaNomes) {
				writer.write(nome + "\r\n");
			}
			
			
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
