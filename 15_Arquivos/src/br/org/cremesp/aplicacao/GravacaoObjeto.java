package br.org.cremesp.aplicacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Curso;

public class GravacaoObjeto {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("J:\\Cursos\\Java\\arquivos\\curso.dat");
			ObjectOutputStream ois = new ObjectOutputStream(fos);
			
			Curso curso = new Curso(1, "Curso teste", 40, 100.00);  
			
			ois.writeObject(curso);
			
			ois.close();
			fos.close();

			JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
