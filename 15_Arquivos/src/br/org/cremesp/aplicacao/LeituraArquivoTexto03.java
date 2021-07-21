package br.org.cremesp.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.UIManager;

public class LeituraArquivoTexto03 {
	public static void main(String[] args) {
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			JFileChooser chooser = new JFileChooser();
			int opcao = chooser.showOpenDialog(null);
			if(opcao == JFileChooser.CANCEL_OPTION) {
				return;
			}
			
			FileReader reader = new FileReader(chooser.getSelectedFile());
			BufferedReader buffer = new BufferedReader(reader);
			
			//leitura de arquivo texto linha a linha
			String texto = "";
			
			while(true) {
				String linha = buffer.readLine();
				if (linha == null){
					break;
				}
				texto += linha + "\r\n";
			}
			System.out.println(texto);
			reader.close();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
}
