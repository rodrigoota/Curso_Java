package br.org.cremesp.utils;

import java.util.Collection;
import java.util.List;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;

public final class Utilitarios {
	
	//método que recebe uma lista de pessoas e retorna a quantidade de alunos
	public static int getPessoas(List<Pessoa> pessoas) {
		
		pessoas.add(new Aluno("Peter"));
		
		int  quantidade = pessoas.size();
//		for (Pessoa pessoa : pessoas) {
//			if (pessoa instanceof Aluno) {
//				quantidade++;
//			}
//		}
		return quantidade;
	}
	
	public static int getPessoas2(List<? extends Pessoa> pessoas) {
		
		//não é possível incluir elementos na lista por instabilidade de tipo
		//pessoas.add(new Aluno("Peter"));
		pessoas.remove(0);
		
		int  quantidade = pessoas.size();
		return quantidade;
	}	
	
}
