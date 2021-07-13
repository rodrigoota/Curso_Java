package br.org.cremesp.classes;

import java.text.NumberFormat;
import java.util.Date;

import br.org.cremesp.enumeracoes.Sexo;
import br.org.cremesp.interfaces.Documento;

public class Funcionario extends Pessoa{
	
	public Funcionario(String nome, Documento documento) {
		super(nome);
		this.setDocumento(documento);
	}
	
	public Funcionario(String nome, Documento documento, String cargo) {
		this(nome, documento);
		this.setCargo(cargo);
	}	
	
	public Funcionario(String nome, Documento documento, String cargo, double salario) {
		this(nome, documento, cargo);
		this.setSalario(salario);
	}
	
	public Funcionario(
			String nome,
			Documento documento,
			Date dataNascimento,
			Sexo sexo,
			String cargo, 
			double salario
			) {
		this(nome, documento, cargo, salario);
		this.setDataNascimento(dataNascimento);
		this.setSexo(sexo);
	}
	
//	public Funcionario(
//			String nome,
//			String cargo, 
//			double salario,
//			Date dataNascimento,
//			Sexo sexo,
//			Endereco endereco) {
//		this(nome, dataNascimento, sexo, cargo, salario);
//		this.setEndereco(endereco);
//	}
//	
//
//	public Funcionario(String nome, Sexo sexo, Date dataNascimento) {
//		super(nome, sexo, dataNascimento);
//	}


	private String cargo;
	private double salario;
	
	//o funcionario pode ter um de 2 tipos de documento: CPF ou CNPJ
	private Documento documento;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String exibir() {
		
		var dados =	super.exibir();
		dados += "\r\nDocumento: " + this.getDocumento();
		dados += "\r\nCargo: " + this.getCargo();
		dados += "\r\nSalario: " +
		NumberFormat.getCurrencyInstance().format(this.getSalario());
		
		return dados;
	}

	@Override
	public String toString() {
		return exibir();
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		if(documento==null) {
			throw new NullPointerException("O documento não é válido");
		}
		this.documento = documento;
	}
	
}
