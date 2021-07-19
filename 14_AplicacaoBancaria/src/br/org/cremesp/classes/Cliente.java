package br.org.cremesp.classes;

import java.util.HashSet;
import java.util.Set;

import br.org.cremesp.interfaces.Documento;

public class Cliente {
	private int codigo;
	private String nome;
	private String telefone;
	private Documento documento;
	private Agencia agencia;
	private Set<ContaCorrente> contas = new HashSet<>();
	

	public Cliente(int codigo, String nome, Agencia agencia) {
		super();
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setAgencia(agencia);
	}
	
	public Cliente(int codigo, String nome, Agencia agencia, Documento documento) {
		this(codigo, nome, agencia);
		this.setDocumento(documento);
	}
	
	public Cliente(int codigo, String nome, Agencia agencia, Documento documento, Set<ContaCorrente> contas) {
		this(codigo, nome, agencia, documento);
		this.setContas(contas);
	}	

	public Cliente(int codigo, String nome, Agencia agencia, Documento documento, String telefone) {
		this(codigo, nome, agencia, documento);
		this.setTelefone(telefone);
	}	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Set<ContaCorrente> getContas() {
		return contas;
	}
	public void setContas(Set<ContaCorrente> contas) {
		this.contas = contas;
	}
	
	@Override
	public String toString() {
		return this.getCodigo() + " - " + this.getNome() + " - Agencia: " + this.getAgencia();
	}
	
}
