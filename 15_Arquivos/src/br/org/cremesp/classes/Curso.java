package br.org.cremesp.classes;

import java.io.Serializable;

public class Curso implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7752286848867892406L;
	
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;


	public Curso(int codigo, String descricao, int ch) {
		super();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCh(ch);
	}
	
	public Curso(int codigo, String descricao, int ch, double preco) {
		this(codigo, descricao, ch);
		this.setPreco(preco);
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
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
		

	@Override
	public String toString() {
		return this.codigo + " - " +this.descricao;
	}

	@Override
	public int hashCode() {
		return this.getCodigo() + this.getDescricao().hashCode() + this.getCh();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Curso) {
			Curso c = (Curso) obj;
			if (this.getCh() == c.getCh() && this.getDescricao().equals(c.getDescricao())
					&& this.getCodigo() == c.getCodigo()) {
				return true;
			}
		}
		return false;
	}

}
