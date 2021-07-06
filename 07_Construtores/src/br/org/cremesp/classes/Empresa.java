package br.org.cremesp.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
	
	private String razaoSocial;
	private Endereco endereco;
	private Date dataFundacao;
	private final double areaUtil; // final => constante por objeto
	
	// dados est�ticos / constantes
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
				.append("\r\nRaz�o Social: ").append(this.getRazaoSocial())
				.append("\r\nRespons�vel pelo Desenvolvimento: ")
				.append(DESENVOLVEDOR)
				.append("\r\n�rea �til: ")
				.append(this.getAreaUtil())
				.append("\r\nData Funda��o: ")
				.append(this.getDataFundacao()==null 
						? "Data de funda��o n�o informada" 
						: df.format(this.getDataFundacao()))
				.append("\r\n").append(this.getEndereco() == null ?
						"Endere�o n�o informado" : this.getEndereco().exibir("ENDERE�O DA EMPRESA"))
				.toString();	
	}
	
}
