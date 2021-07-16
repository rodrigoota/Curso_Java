package br.org.cremesp.classes;

import java.util.Set;

public class Banco {
	
	private int numBanco;
	private String nomeBanco;
	private Set<Agencia> agencias; //agencia não pode repetir
	
	public Banco(int numBanco, String nomeBanco) {
		this.setNumBanco(numBanco);
		this.setNomeBanco(nomeBanco);
	}
	
	public int getNumBanco() {
		return numBanco;
	}
	public void setNumBanco(int numBanco) {
		this.numBanco = numBanco;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public Set<Agencia> getAgencias() {
		return agencias;
	}
	public void setAgencias(Set<Agencia> agencias) {
		this.agencias = agencias;
	}
	
	@Override
	public String toString() {
		return this.getNumBanco() + " - " + this.getNomeBanco();
	}
	
}
