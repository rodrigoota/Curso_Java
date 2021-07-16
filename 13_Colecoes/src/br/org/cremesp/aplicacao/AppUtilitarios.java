package br.org.cremesp.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.classes.DocumentoCpf;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.utils.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		List<Pessoa> lista1 = new ArrayList<>();
		lista1.add(new Aluno("nome do aluno"));
		lista1.add(new Funcionario("funcionario", new DocumentoCpf("12345678910")));
		
		int quantAlunos = Utilitarios.getPessoas(lista1);
		System.out.println("Elementos na lista do método: " + quantAlunos);
		System.out.println("Elementos na lista atual: " + lista1.size());
		System.out.println();
		
		//lista de objetos Aluno
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("aluno 1"));
		alunos.add(new Aluno("aluno 2"));
		
		/* Não existe herança de List<Objeto>
		 * Exemplo:
		 * Aluno extends Pessoa
		 * mas List<Aluno> não herda List<Pessoa>
		 * List<Pessoa> lista2 = new ArrayList<Aluno>();
		 */
		quantAlunos = Utilitarios.getPessoas2(alunos);
		
		System.out.println("Elementos na lista do método getPessoas2: " + quantAlunos);
		
		List<Pessoa> lista2 = new ArrayList<Pessoa>();
		
		List<? extends Pessoa> lista3 = new ArrayList<Funcionario>(); //isso não faz muito sentido pois não pode ser adicionado elementos
		//lista3.add(new Funcionario("", null));        ERRO
		
		List<? extends Pessoa> lista4 = alunos;
		
		System.out.println("lista2: " + lista2);
		System.out.println("lista3: " + lista3);
		System.out.println("lista4: " + lista4);
		
	}
}
