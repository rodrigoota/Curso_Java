package br.org.cremesp.classes;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

import br.org.cremesp.enumeracoes.Tipo;

public class ContaCorrente {
	
	private String numeroConta;
	private Cliente cliente;
	private double saldo;
	private List<Movimento> movimentos = new ArrayList<>();
	

	public ContaCorrente(String numeroConta, Cliente cliente, double saldo) {
		super();
		this.setNumeroConta(numeroConta);
		this.setCliente(cliente);
		this.setSaldo(saldo);
	}
	
	public void efetuarSaque(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser positivo");
		}
		if (this.getSaldo() < valor) {
			throw new NumberFormatException("Saldo insuficiente");
		}
		Movimento m = new Movimento(this, Tipo.SAIDA, new Date(), "Saque", valor);
		this.getMovimentos().add(m);
		this.setSaldo(this.getSaldo() - valor);
		
	}
	
	public  void efetuarDeposito(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser positivo");
		}		
		Movimento m = new Movimento(this, Tipo.ENTRADA, new Date(), "Depósito", valor);
		this.getMovimentos().add(m);		
		this.setSaldo(this.getSaldo() + valor);
		
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
	private void setSaldo(double saldo) {
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
		return this.getNumeroConta().hashCode() + this.getCliente().getAgencia().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ContaCorrente) {
			ContaCorrente a = (ContaCorrente) obj;
			if (this.getNumeroConta() == a.getNumeroConta() && this.getCliente().getAgencia() == a.getCliente().getAgencia()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() +
				": " + this.getNumeroConta() + " = " + this.getCliente() + " - Saldo: " + this.getSaldo();
	}
	
	public String gerarExtrato() {
		StringBuilder sb = new StringBuilder();
		
		Formatter fmt = new Formatter();
		//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Cabeçalho
		fmt.format("%-10s %-20s %-20s %10s%n", "MOVIMENTO", "HISTÓRICO", "DATA", "VALOR");
		
		//Movimentos
		for (Movimento movimento : movimentos) {
			fmt.format("%-10s %-20s %-20s %10.2f%n", 
					movimento.getCodigo(),
					movimento.getHistorico(),
					df2.format(movimento.getData()),
					movimento.getValor()
					);
		}
		
		sb.append(fmt.toString());
		fmt.flush();
		fmt.close();
		
		sb.append("Saldo: ").append(NumberFormat.getCurrencyInstance().format(this.getSaldo()));
		
		return sb.toString();
	}	
	
}
