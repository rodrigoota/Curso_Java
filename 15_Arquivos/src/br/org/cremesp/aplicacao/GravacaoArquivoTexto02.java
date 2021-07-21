package br.org.cremesp.aplicacao;

import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GravacaoArquivoTexto02 {
	public static void main(String[] args) {

		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			JFileChooser chooser = new JFileChooser();
			int opcao = chooser.showSaveDialog(null);
			if(opcao == JFileChooser.CANCEL_OPTION) {
				return;
			}			

			FileWriter writer = new FileWriter(chooser.getSelectedFile(), true);

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
