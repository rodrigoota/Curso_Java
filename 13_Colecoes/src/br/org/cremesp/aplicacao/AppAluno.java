package br.org.cremesp.aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.classes.Curso;
import br.org.cremesp.enumeracoes.Sexo;

public class AppAluno {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Jose Maria", Sexo.MASCULINO, new Date());
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso(10, "PHP", 40));
		cursos.add(new Curso(20, "DevOps", 40));
		cursos.add(new Curso(30, "Aws Developer", 40));
		
		aluno.setCursos(cursos);
		
		JOptionPane.showMessageDialog(null, aluno.exibir());
		System.out.println(aluno.exibir());
		
		System.out.println(aluno.listarCursos());
	}
}
