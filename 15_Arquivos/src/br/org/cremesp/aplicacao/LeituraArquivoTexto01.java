package br.org.cremesp.aplicacao;

import java.io.FileReader;

public class LeituraArquivoTexto01 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("J:\\Cursos\\Java\\arquivos\\nomes.txt");
			
			//leitura de arquivo texto caracter por caracter
			String linha = "";
			
			while(true) {
				int ch = reader.read();
				if(ch == -1) { //EOF = end of file
					break;
				}
				linha += (char)ch;
				//System.out.print((char)ch);
			}
			System.out.println(linha);
			reader.close();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
