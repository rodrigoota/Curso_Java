package br.org.cremesp.aplicacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.org.cremesp.classes.Curso;

public class LeituraObjeto {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("J:\\Cursos\\Java\\arquivos\\curso.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Curso curso = (Curso) ois.readObject();
			System.out.println(curso);
			
			ois.close();
			fis.close();

		} catch (Exception e) {

		}
	}

}
