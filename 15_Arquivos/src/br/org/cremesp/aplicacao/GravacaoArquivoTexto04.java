package br.org.cremesp.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class GravacaoArquivoTexto04 {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("J:\\Cursos\\Java\\arquivos\\cursos.txt",true);
			
			for (int i = 0; i < 5; i++) {
				String codigo = JOptionPane.showInputDialog("Informe o codigo do curso " + (i + 1));
				String descricao = JOptionPane.showInputDialog("Informe a descrição do curso " + (i + 1));
				String ch = JOptionPane.showInputDialog("Informe a carga horária do curso " + (i + 1));
				String preco = JOptionPane.showInputDialog("Informe o preço do curso " + (i + 1));
				
				String linha = codigo + ";" + descricao + ";" + ch + ";" + preco + "\r\n";
				
				writer.write(linha);
			}
			
			//JOptionPane.showOptionDialog(null, writer, null, 0, 0, null, args, writer);
			
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
