package br.org.cremesp.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

import br.org.cremesp.enumeracoes.Sexo;

public class GravacaoArquivoTexto03 {
	public static void main(String[] args) {
		//Gravando arquivo texto
		try {
			FileWriter writer = new FileWriter("J:\\Cursos\\Java\\arquivos\\alunos.txt", true);		
			
			//List<Alunos> alunos = new ArrayList<>();
			
			for (int i = 0; i < 5; i++) {
				String nome = JOptionPane.showInputDialog("Informe o nome do aluno " + (i + 1));
				String data = JOptionPane.showInputDialog("Informe a data de nesc. do aluno " + (i + 1));
				Sexo sexo = (Sexo) JOptionPane.showInputDialog(null,
						"Informe o sexo do aluno " + (i + 1),
						"Sexo",
						JOptionPane.QUESTION_MESSAGE,
						null,
						Sexo.values(),
						null);
				
				String linha = nome + ";" + data + ";" + sexo + "\r\n";
				
				writer.write(linha);
			}
			
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
