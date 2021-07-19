package br.org.cremesp.classes;

import java.text.NumberFormat;

public class ContaEspecial extends ContaCorrente {
	

	private double limite;

	public ContaEspecial(String numeroConta, Cliente cliente, double saldo, double limite) {
		super(numeroConta, cliente, saldo);
		this.setLimite(limite);
	}
	
	public double getLimite() {
		return limite;
	}

	private void setLimite(double limite) {
		if (limite < 0) {
			throw new IllegalArgumentException("Limite não pode ser negativo");
		}
		this.limite = limite;
	}
	
	@Override
	public void efetuarSaque(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor de saque não pode ser maior que o limite");
		}
		if (this.getSaldo() + this.getLimite() < valor) {
			throw new NumberFormatException("Saldo insuficiente");
		}
		super.efetuarSaque(valor);
	}
	
	@Override
	public void efetuarDeposito(double valor) {
		this.setLimite(limite += valor);
		super.efetuarDeposito(valor);
	}
	
	@Override
	public String gerarExtrato() {
		return super.gerarExtrato() +
				"\r\nLimite: " + NumberFormat.getCurrencyInstance().format(this.getLimite()) +
				"\r\nSaldo Total: " + NumberFormat.getCurrencyInstance().format(this.getLimite() + this.getSaldo());
	}
	
}
