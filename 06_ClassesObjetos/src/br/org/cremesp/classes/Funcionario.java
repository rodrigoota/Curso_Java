package br.org.cremesp.classes;

import java.text.NumberFormat;

import br.org.cremesp.enumeracoes.Sexo;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private String cargo;
	private double salario;
	private Empresa empresa;
	private Sexo sexo;
	
	private double irpf;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

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
		this.irpf = this.calcularIrpf();
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	//propriedades 'readonly' pois não tem setter
	public double getIrpf() {
		return this.irpf;
	}
	public double getSalarioLiquido() {
		return this.getSalario() - this.getIrpf();
	}

	private double calcularIrpf() {
		
		double baseCalculo = this.salario;
		double imposto = 0;
		double[] taxas = {0, 7.5, 15, 22.5, 27.5};
		double[] valores = {0, 1903.98, 2826.65, 3751.05, 4664.68};
		
		for (int i = taxas.length - 1; i >= 0; i--) {
			if(baseCalculo > valores[i]) {
				imposto += (baseCalculo - valores[i]) * taxas[i] / 100;
				baseCalculo = valores[i];
			}
		}		
		return imposto;
	}
	
	public String exibir() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		return new StringBuilder("DADOS DO FUNCIONÁRIO")
				.append("\r\nMatrícula: ").append(this.getMatricula())
				.append("\r\nNome: ").append(this.getNome())
				.append("\r\nSexo: ").append(this.getSexo())
				.append("\r\nCargo: ").append(this.getCargo())
				.append("\r\nSalario: ").append(nf.format(this.getSalario()))
				.append("\r\nIRPF: ").append(nf.format(this.getIrpf()))
				.append("\r\nSalário Líquido: ").append(nf.format(this.getSalarioLiquido()))
				.append("\r\n").append(this.getEmpresa() == null ?
						"Empresa não informada" : this.getEmpresa().exibir())
				.toString();

	}

}
