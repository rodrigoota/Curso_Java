package br.org.cremesp.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.org.cremesp.enumeracoes.Sexo;

public abstract class Pessoa implements Comparable<Pessoa>{
	
	private int id;
	private String nome;
	private Date dataNascimento;
	private Sexo sexo;
	private Endereco endereco;
	
	
	//construtores
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pessoa(String nome) {
		this.setNome(nome);
	}
	
	public Pessoa(String nome, Sexo sexo) {
		this(nome);
		this.setSexo(sexo);
	}
	
	public Pessoa(String nome, Sexo sexo, Date dataNascimento) {
		this(nome, sexo);
		this.setDataNascimento(dataNascimento);
	}
	
	public Pessoa(String nome, Sexo sexo, Date dataNascimento, Endereco endereco) {
		this(nome, sexo, dataNascimento);
		this.setEndereco(endereco);
	}
	
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String exibir() {
		StringBuilder sb = new StringBuilder("Nome: ")
				.append(this.getNome())
				.append("\r\nData Nascimento: ")
				.append(new SimpleDateFormat("dd/MM/yyyy").format(this.getDataNascimento()))
				.append("\r\nSexo: ")
				.append(this.getSexo());
		if(this.getEndereco()!=null) {
			sb.append("\r\n").append(this.getEndereco().exibir());
		}
		return sb.toString();
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.getNome().compareTo(o.getNome());
	}
}
