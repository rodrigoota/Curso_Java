package br.org.cremesp.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraArquivoTexto02 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("J:\\Cursos\\Java\\arquivos\\nomes.txt");
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
