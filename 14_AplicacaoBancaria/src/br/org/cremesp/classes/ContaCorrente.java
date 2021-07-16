package br.org.cremesp.classes;

import java.util.List;

public class ContaCorrente {
	
	private String numeroConta;
	private Cliente cliente;
	private double saldo;
	private List<Movimento> movimentos;
	
	public void efetuarSaque(double valor) {
		
	}
	
	public  void efetuarDeposito(double valor) {
		
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public List<Movimento> getMovimentos() {
		return movimentos;
	}
	public void setMovimentos(List<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
	
	@Override
	public int hashCode() {
		return this.getNumeroConta().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ContaCorrente) {
			ContaCorrente a = (ContaCorrente) obj;
			if (this.getNumeroConta() == a.getNumeroConta()) {
				return true;
			}
		}
		return false;
	}
	
}
