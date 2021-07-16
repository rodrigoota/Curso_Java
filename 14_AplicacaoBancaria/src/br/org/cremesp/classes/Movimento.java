package br.org.cremesp.classes;

import java.util.Date;

import br.org.cremesp.enumeracoes.Tipo;

public class Movimento {
	private int codigo;
	private ContaCorrente conta;
	private Tipo tipo;
	private Date data;
	private String historico;
	private double valor;
	
	private static int CONTADOR = 1;
	
	public Movimento(int codigo, ContaCorrente conta, Tipo tipo, Date data, String historico, double valor) {
		super();
		this.codigo = CONTADOR++;		
		this.conta = conta;
		this.tipo = tipo;
		this.data = data;
		this.historico = historico;
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}
	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
