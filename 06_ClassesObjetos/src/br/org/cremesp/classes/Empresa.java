package br.org.cremesp.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
	
	private String razaoSocial;
	private Endereco endereco;
	private Date dataFundacao;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	public String exibir() {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		return new StringBuilder("\r\nDADOS DA EMPRESA")
				.append("\r\nRazão Social: ").append(this.getRazaoSocial())
				.append("\r\nData Fundação: ")
				.append(df.format(this.getDataFundacao()))
				.append("\r\n").append(this.getEndereco() == null ?
						"Endereço não informado" : this.getEndereco().exibir("ENDEREÇO DA EMPRESA"))
				.toString();	
	}
	
}
