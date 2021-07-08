package br.org.cremesp.exercicios.enumeracoes;

public enum Especialidade {

	CARDIOLOGIA("CARDIO"),
	DERMATOLOGIA("DERMATO"),
	GINECOLOGIA("GINECO"),
	OFTALMOLOGIA("OFTALMO"),
	REUMATOLOGIA("REUMATO"),
	ENDOCRINOLOGIA("ENDOCRINO");
	
	private String sigla;
	private Especialidade(String sigla) {
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return this.sigla;
	}
}
