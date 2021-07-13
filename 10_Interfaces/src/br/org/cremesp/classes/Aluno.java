package br.org.cremesp.classes;

import java.util.Date;

import br.org.cremesp.enumeracoes.Sexo;

public class Aluno extends Pessoa{
	
	private Curso curso;
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, Sexo sexo, Date dataNascimento) {
		super(nome, sexo, dataNascimento);
	}
	
	public Aluno(String nome, Sexo sexo, Date dataNascimento, Curso curso) {
		this(nome, sexo, dataNascimento);
		this.curso = curso;
	}

	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String exibir() {
		StringBuilder sb = new StringBuilder(super.exibir())
				.append("\r\nCurso: ").append(this.getCurso());
		return sb.toString();
	}
	
}
