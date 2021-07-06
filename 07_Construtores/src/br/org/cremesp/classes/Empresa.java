package br.org.cremesp.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
	
	private String razaoSocial;
	private Endereco endereco;
	private Date dataFundacao;
	private final double areaUtil; // final => constante por objeto
	
	// dados estáticos / constantes
	public static final String DESENVOLVEDOR = "Equipe do CREMESP";
	
	
	public Empresa(String razaoSocial, double area) {
		this.areaUtil = area;		
		this.setRazaoSocial(razaoSocial);
	}
	
	public Empresa(String razaoSocial, double area, Date dataFundacao) {
		this(razaoSocial, area);
		this.setDataFundacao(dataFundacao);
	}	
	
	public Empresa(String razaoSocial, double area, Date dataFundacao, Endereco endereco) {
		this(razaoSocial, area, dataFundacao);
		this.setEndereco(endereco);
	}		
	
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
	
	public double getAreaUtil() {
		return areaUtil;
	}	
	
	public String exibir() {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		return new StringBuilder("\r\nDADOS DA EMPRESA")
				.append("\r\nRazão Social: ").append(this.getRazaoSocial())
				.append("\r\nResponsável pelo Desenvolvimento: ")
				.append(DESENVOLVEDOR)
				.append("\r\nÁrea útil: ")
				.append(this.getAreaUtil())
				.append("\r\nData Fundação: ")
				.append(this.getDataFundacao()==null 
						? "Data de fundação não informada" 
						: df.format(this.getDataFundacao()))
				.append("\r\n").append(this.getEndereco() == null ?
						"Endereço não informado" : this.getEndereco().exibir("ENDEREÇO DA EMPRESA"))
				.toString();	
	}
	
}
