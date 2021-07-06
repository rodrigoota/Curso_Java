package br.org.cremesp.enumeracoes;

public enum Sexo {
	
	MASCULINO("M"), FEMININO("F");
	
	private String sigla;
	
	private Sexo(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return this.sigla;
	}
	
}
