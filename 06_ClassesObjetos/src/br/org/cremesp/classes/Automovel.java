package br.org.cremesp.classes;

public class Automovel {
	
	//atributos (caracteristicas presentes nos objetos)
	//também chamadas de variaveis de instancia
	private String marca;
	private String modelo;
	private int ano;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano < 0) {			
			this.ano = ano * (-1);
		} else {
			this.ano = ano;
		}
	}

	public void lerDados(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}
	
	public String apresentarDados() {
		
		StringBuilder sb = new StringBuilder();
		String resposta = sb
				.append("Marca: ")
				.append(this.getMarca())
				.append("\r\nModelo: ")
				.append(this.getModelo())
				.append("\r\nAno: ")
				.append(this.getAno())
				.toString();
		
		return resposta;
				
	}
	
}
