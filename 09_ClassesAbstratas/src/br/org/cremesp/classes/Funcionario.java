package br.org.cremesp.classes;

import java.text.NumberFormat;
import java.util.Date;

import br.org.cremesp.enumeracoes.Sexo;

public class Funcionario extends Pessoa{
	
	public Funcionario(String nome) {
		super(nome);
	}
	
	public Funcionario(String nome, String cargo) {
		this(nome);
		this.setCargo(cargo);
	}	
	
	public Funcionario(String nome, String cargo, double salario) {
		this(nome, cargo);
		this.setSalario(salario);
	}
	
	public Funcionario(
			String nome,
			Date dataNascimento,
			Sexo sexo,
			String cargo, 
			double salario
			) {
		this(nome, cargo, salario);
		this.setDataNascimento(dataNascimento);
		this.setSexo(sexo);
	}
	
	public Funcionario(
			String nome,
			String cargo, 
			double salario,
			Date dataNascimento,
			Sexo sexo,
			Endereco endereco) {
		this(nome, dataNascimento, sexo, cargo, salario);
		this.setEndereco(endereco);
	}
	

	private String cargo;
	private double salario;
	
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
		
		dados += "\r\nCargo: " + this.getCargo();
		dados += "\r\nSalario: " +
		NumberFormat.getCurrencyInstance().format(this.getSalario());
		
		return dados;
	}

	@Override
	public String toString() {
		return exibir();
	}
	
}
