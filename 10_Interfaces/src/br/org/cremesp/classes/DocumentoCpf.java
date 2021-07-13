package br.org.cremesp.classes;

import br.org.cremesp.interfaces.Documento;

public class DocumentoCpf implements Documento{
	
	private String numero;

	public DocumentoCpf(String numero) {
		this.setNumero(numero);
	}

	@Override
	public void setNumero(String numero) {
		if(numero == null || numero.trim().length() != 11) {
			throw new NumberFormatException("O CNPJ deve ter 11 dígitos");
		}
		this.numero = numero;
	}

	@Override
	public String getNumero() {
		return this.numero;
	}

	@Override
	public String toString() {
		
		String t = this.getNumero().substring(0, 3) + "." + this.getNumero().substring(3, 6)
				+ "." + this.getNumero().substring(6, 9) + "-" + this.getNumero().substring(9, 11);
		
		return "CPF: " + t;
		
	
	}
	

}
