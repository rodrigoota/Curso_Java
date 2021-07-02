package br.org.cremesp.classes;

public class Automovel {
	
	//atributos (caracteristicas presentes nos objetos)
	//também chamadas de variaveis de instancia
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca==null) {
			throw new NullPointerException("Marca inválida.");
		}
		if(marca.trim().length() == 0) {
			throw new IllegalArgumentException("A marca deve ser informada corretamente.");
		}	
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if(modelo == null || modelo.trim().length() == 0) {
			throw new IllegalArgumentException("O modelo é inválido.");
		}			
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano <= 0) {			
			throw new IllegalArgumentException("O ano deve ser positivo");
		} 
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		//validação da placa usando expressão regular (REGEX)
		if (placa != null && !placa.matches("[A-Z]{3}[0-9]{4}")) {
			throw new NumberFormatException("Placa inválida.");
		}
		this.placa = placa;
	}

	public void lerDados(String marca, String modelo, int ano, String placa) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
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
				.append("\nPlaca: ")
				.append(this.getPlaca())
				.toString();
		
		return resposta;
				
	}


}
