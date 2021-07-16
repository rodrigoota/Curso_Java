package br.org.cremesp.classes;

import java.util.Set;

import br.org.cremesp.interfaces.Documento;

public class Cliente {
	private int codigo;
	private String nome;
	private String telefone;
	private Documento documento;
	private Agencia agencia;
	private Set<ContaCorrente> contas;
	
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
		return super.toString();
	}
	
}
