package br.org.cremesp.aplicacao.conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

import br.org.cremesp.classes.Curso;

public class AppSet04 {
	public static void main(String[] args) {
		
		Set<Curso> cursos = new LinkedHashSet<Curso>();
		cursos.add(new Curso(320, "Fisioterapia", 4000));
		cursos.add(new Curso(295, "Matemática", 3500));
		cursos.add(new Curso(280, "Letras", 4000));
		cursos.add(new Curso(450, "Arquitetura", 5600));
		cursos.add(new Curso(430, "Engenharia", 6000));
		cursos.add(new Curso(450, "Arquitetura", 5600));
		
		cursos.forEach(s -> System.out.println(s + " - Hash: " + s.hashCode()));
		
		Curso c1 = new Curso(450, "Arquitetura", 5600);
		Curso c2 = new Curso(450, "Arquitetura", 5600);
		
		//depois de dar overrride no equals da classe Curso ficou true
		System.out.println(c1.equals(c2));
		
		
	}
}
