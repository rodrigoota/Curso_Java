package br.org.cremesp.classes;

public class Endereco {
	private String logradouro;
	private int numero;
	private String cidade;
	private String cep;
	
	public String getLogradouro() {
		return logradouro;
	}
	
	//ClassNotFoundException � exce��o verificada ent�o precisa do throws
	public void setLogradouro(String logradouro) throws ClassNotFoundException {
		if (logradouro == null) {
			throw new ClassNotFoundException("Valor inv�lido");
		}
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String exibir() {
		return exibir("DADOS DO ENDERE�O");
	}
	
	public String exibir(String titulo) {
		return new StringBuilder("\r\n").append(titulo)
				.append("\r\nLogradouro: ").append(this.getLogradouro())
				.append("\r\nN�mero: ").append(this.getNumero())
				.append("\r\nCidade: ").append(this.getCidade())
				.append("\r\nCEP: ").append(this.getCep())
				.toString();
	}
	
}
