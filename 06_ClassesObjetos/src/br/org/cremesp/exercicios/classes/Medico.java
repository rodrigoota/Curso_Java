package br.org.cremesp.exercicios.classes;

import br.org.cremesp.exercicios.enumeracoes.Especialidade;

public class Medico {

	private int crm;
	private String nome;
	private Especialidade especialidade;
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public String exibir() {
		return exibir("DADOS DO MÉDICO");
	}
	
	public String exibir(String titulo) {
		return new StringBuilder("\r\n").append(titulo)
				.append("\r\nCRM: ").append(this.getCrm())
				.append("\r\nNome: ").append(this.getNome())
				.append("\r\nEspecialidade: ").append(this.getEspecialidade())
				.toString();
	}
	
}
