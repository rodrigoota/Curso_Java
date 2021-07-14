package br.org.cremesp.aplicacao.listas;

import java.util.ArrayList;
import java.util.List;

import br.org.cremesp.classes.Curso;

public class AppList03 {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(320, "Fisioterapia", 4000));
		cursos.add(new Curso(295, "Matemática", 3500));
		cursos.add(new Curso(280, "Letras", 4000));
		cursos.add(new Curso(450, "Arquitetura", 5600));
		cursos.add(new Curso(430, "Engenharia", 6000));
		
		
		//Collections.sort(cursos,(s, p) -> s.getDescricao().compareTo(p.getDescricao()));
		cursos.sort((s, p) -> s.getDescricao().compareTo(p.getDescricao()));
		cursos.forEach(System.out::println);
		
		//cursos.sort();
		
		System.out.println();
		cursos.stream()
			.filter(p -> p.getDescricao().contains("i"))
			.limit(2)
			.forEachOrdered(s -> System.out.println(s));
	}
}
