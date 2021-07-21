package br.org.cremesp.aplicacao;

import java.io.File;

public class ClasseFile {
	public static void main(String[] args) {
		File file = new File("J:\\Cursos\\Java\\arquivos");
		String[] arquivos = file.list();
		
		for (String item : arquivos) {
			System.out.println(item);
		}
		System.out.println();
		
		file = new File("C:\\Windows");
		String[] dados = file.list();
		
		for (String item : dados) {
			File f = new File("C:\\Windows" + item);
			if(f.isDirectory()) {
				System.out.println("Pasta: " + item);
			} else {
				System.out.println("Arquivo: " + item);
			}
		}
		
	}
}
