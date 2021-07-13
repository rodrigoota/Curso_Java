package br.org.cremesp.classes;

public class Curso {
	
	private int codigo;
	private String descricao;
	private int ch;



	public Curso(int codigo, String descricao, int ch) {
		super();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCh(ch);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	@Override
	public String toString() {
		return this.codigo + " - " +this.descricao;
	}
	
	
	
}
