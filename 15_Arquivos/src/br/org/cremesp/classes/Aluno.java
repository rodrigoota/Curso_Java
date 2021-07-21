package br.org.cremesp.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

import br.org.cremesp.enumeracoes.Sexo;

public class Aluno extends Pessoa{
	
	private List<Curso> cursos = new ArrayList<Curso>();
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, Sexo sexo, Date dataNascimento) {
		super(nome, sexo, dataNascimento);
	}
	
	public Aluno(String nome, Sexo sexo, Date dataNascimento, List<Curso> cursos) {
		this(nome, sexo, dataNascimento);
		this.setCursos(cursos);
	}

	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String exibir() {
		StringBuilder sb = new StringBuilder(super.exibir());
		
		if(this.getCursos() != null && this.getCursos().size() > 0) {
			sb.append("\r\n").append(this.getCursos());
		}
		return sb.toString();
	}
	
	public String listarCursos() {
		StringBuilder sb = new StringBuilder();
		
		Formatter fmt = new Formatter();
		
		//Cabeçalho
		fmt.format("%6s %-20s %-5s %10s%n", "CÓDIGO", "DESCRIÇÃO", "CH", "VALOR");
		
		//conteudos
		for (Curso curso : cursos) {
			fmt.format("%-6s %-20s %-5s %10.2f%n", 
					curso.getCodigo(),
					curso.getDescricao(),
					curso.getCh(),
					curso.getPreco());
		}
		
		sb.append(fmt.toString());
		fmt.flush();
		fmt.close();		
		return sb.toString();
	}

	@Override
	public String toString() {
		return this.getNome();
	}
	
}
