package br.org.cremesp.aplicacao.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.org.cremesp.classes.Curso;
import br.org.cremesp.classes.ordenadores.OrdenacaoCodigoCurso;
import br.org.cremesp.classes.ordenadores.OrdenacaoDescricaoCurso;

public class AppList02 {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(320, "Fisioterapia", 4000));
		cursos.add(new Curso(295, "Matemática", 3500));
		cursos.add(new Curso(280, "Letras", 4000));
		cursos.add(new Curso(450, "Arquitetura", 5600));
		cursos.add(new Curso(430, "Engenharia", 6000));
		
		cursos.forEach(c -> System.out.println(c));
		
		//colocando a lista em ordem
		Collections.sort(cursos,new OrdenacaoCodigoCurso()); //por codigo usando comparator
		System.out.println();
		cursos.forEach(c -> System.out.println(c));
		
		Collections.sort(cursos,new OrdenacaoDescricaoCurso()); // por descricao
		System.out.println();
		cursos.forEach(c -> System.out.println(c));
		
	}
}
