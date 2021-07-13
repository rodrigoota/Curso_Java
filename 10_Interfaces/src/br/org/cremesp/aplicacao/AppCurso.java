package br.org.cremesp.aplicacao;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {

		Curso curso = new Curso(1000, "Fundamentos Java", 100);
		System.out.println(curso);

		Curso[] cursos = { new Curso(10, "Java", 10), new Curso(20, "Frontend", 40) };

		Curso opcao = (Curso) JOptionPane.showInputDialog(
				null, 
				"Selecione o curso", 
				"Curso", 
				0, 
				null, 
				cursos, 
				null);
		
		System.out.println("Curso selecionado: " + opcao);
		
	}
}
