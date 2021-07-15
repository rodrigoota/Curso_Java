package br.org.cremesp.utils;

import java.util.List;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.classes.Pessoa;

public final class Utilitarios {
	
	//método que recebe uma lista de pessoas e retorna a quantidade de alunos
	public static int getPessoas(List<Pessoa> pessoas) {
		
		pessoas.add(new Aluno("Peter"));
		
		int  quantidade =0;
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Aluno) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
}
