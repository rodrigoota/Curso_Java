package br.org.cremesp.exercicios.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clinica {

	private int codigo;
	private String descricao;
	private Date dataFundacao;
	private Paciente[] pacientes;
	
	private static int CONTADOR = 1;
	
	//CONSTRUTORES
	public Clinica(String descricao) {
		this.codigo = CONTADOR++;
		this.setDescricao(descricao);
	}
	
	public Clinica(String descricao, Date dataFundacao) {
		this(descricao);
		this.setDataFundacao(dataFundacao);
	}
	
	public Clinica(String descricao, Date dataFundacao, Paciente[] pacientes) {
		this(descricao, dataFundacao);
		this.setPacientes(pacientes);
	}

	public int getCodigo() {
		return codigo;
	}

//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public Paciente[] getPacientes() {
		return pacientes;
	}

	public void setPacientes(Paciente[] pacientes) {
		this.pacientes = pacientes;
	}

	public String exibir() {
		return exibir("DADOS DA CLÍNICA");
	}

	public String exibir(String titulo) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		return new StringBuilder("\r\n").append(titulo)
				.append("\r\nCódigo: ").append(this.getCodigo())
				.append("\r\nDescrição: ").append(this.getDescricao())
				.append("\r\nData da Fundação: ").append(df.format(this.getDataFundacao()))
				.append("\r\nPacientes: ")
				.append(this.getPacientes() == null ? "Pacientes não informados" : showRelatorioPacientes(this.getPacientes()))
				.toString();
	}
	
	public String showRelatorioPacientes(Paciente[] pacientes) {
		String relatorioPacientes = new String();
		for (int i = 1; i <= pacientes.length; i++) {
			relatorioPacientes += pacientes[i-1].exibir("\r\nDADOS DO PACIENTE " + i);
		}
		return relatorioPacientes;
	}

}
