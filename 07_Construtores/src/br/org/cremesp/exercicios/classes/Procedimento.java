package br.org.cremesp.exercicios.classes;

import java.text.NumberFormat;

public class Procedimento {

	private int codigo;
	private String descricao;
	private double valor;
	
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String exibir() {
		return exibir("DADOS DO PROCEDIMENTO");
	}
	
	public String exibir(String titulo) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		return new StringBuilder("\r\n").append(titulo)
				.append("\r\nCódigo: ").append(this.getCodigo())
				.append("\r\nDescrição: ").append(this.getDescricao())
				.append("\r\nValor: ").append(nf.format(this.getValor()))
				.toString();
	}

}
