package br.org.cremesp.classes;

public class Automovel {
	
	//atributos (caracteristicas presentes nos objetos)
	//tamb�m chamadas de variaveis de instancia
	private int codigo;
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	//atributo est�tico
	private static int CONTADOR = 1;
	
	//construtor	
	public Automovel(String marca, String modelo, int ano) {
		this.codigo = CONTADOR++;
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}
	
	public Automovel(String marca, String modelo, int ano, String placa) {
		this(marca, modelo, ano);
		this.setPlaca(placa);
	}
	
	public int getCodigo() {
		return codigo;
	}	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		if (marca==null) {
			throw new NullPointerException("Marca inv�lida.");
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
			throw new IllegalArgumentException("O modelo � inv�lido.");
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
		//valida��o da placa usando express�o regular (REGEX)
		if (placa != null && !placa.matches("[A-Z]{3}[0-9]{4}")) {
			throw new NumberFormatException("Placa inv�lida.");
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
		
		StringBuilder sb = new StringBuilder()
				.append("C�digo: ")
				.append(this.getCodigo())
				.append("\r\nMarca: ")
				.append(this.getMarca())
				.append("\r\nModelo: ")
				.append(this.getModelo())
				.append("\r\nAno: ")
				.append(this.getAno());
		
		if(this.getPlaca()!=null) {
			sb.append("\nPlaca: ")
			.append(this.getPlaca());
		}
		
		return sb.toString();		
	}


}
