package br.org.cremesp.classes;

import java.util.List;

public class Agencia {
	private int numAgencia;
	private String nomeAgencia;
	private Banco banco;
	private Endereco endereco;
	private List<Cliente> clientes;
	
	public Agencia(int numAgencia, String nomeAgencia, Banco banco) {
		super();
		this.setNumAgencia(numAgencia);
		this.setNomeAgencia(nomeAgencia);
		this.setBanco(banco);
	}
	
	public Agencia(int numAgencia, String nomeAgencia, Banco banco, Endereco endereco) {
		this(numAgencia, nomeAgencia, banco);
		this.setEndereco(endereco);
	}
	
	public Agencia(int numAgencia, String nomeAgencia, Banco banco, Endereco endereco, List<Cliente> clientes) {
		this(numAgencia, nomeAgencia, banco, endereco);
		this.setClientes(clientes);
	}
	
	
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@Override
	public int hashCode() {
		return this.getNumAgencia() + this.getBanco().getNumBanco();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Agencia) {
			Agencia a = (Agencia) obj;
			if (this.getNumAgencia() == a.getNumAgencia()  && this.getBanco().getNumBanco() == a.getBanco().getNumBanco()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.getBanco().getNomeBanco() + " - " + this.getNumAgencia() + " - " + this.getNomeAgencia();
	}
	
}
