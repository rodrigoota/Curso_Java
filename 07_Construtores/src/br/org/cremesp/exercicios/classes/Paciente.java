package br.org.cremesp.exercicios.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.org.cremesp.exercicios.enumeracoes.Sexo;

public class Paciente {
	
	private String cpf;
	private String nome;
	private Date dataNascimento;
	private Sexo sexo;
	private Tratamento[] tratamentos;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
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
	public Tratamento[] getTratamentos() {
		return tratamentos;
	}
	public void setTratamentos(Tratamento[] tratamentos) {
		this.tratamentos = tratamentos;
	}
	
	public String exibir() {
		return exibir("DADOS DO PACIENTE");
	}
	
	public String exibir(String titulo) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		return new StringBuilder("\r\n").append(titulo)
				.append("\r\nCPF: ").append(this.getCpf())
				.append("\r\nNome: ").append(this.getNome())
				.append("\r\nData de Nascimento: ").append(df.format(this.getDataNascimento()))
				.append("\r\nSexo: ").append(this.getSexo())
				.append("\r\nTratamentos: ")
				.append(this.getTratamentos() == null ? "Tratamentos não informados" : showRelatorioTratamentos(this.getTratamentos()))
				.toString();
	}
	
	private static String showRelatorioTratamentos(Tratamento[] tratamentos) {
		String relatorioTratamentos = new String();
		for (int i = 1; i <= tratamentos.length; i++) {
			relatorioTratamentos += tratamentos[i-1].exibir("\r\nDADOS DO TRATAMENTO " + i);
		}
		return relatorioTratamentos;
	}
	
}
