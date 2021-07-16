package br.org.cremesp.classes;

import br.org.cremesp.interfaces.Documento;

public class DocumentoCnpj implements Documento{
	
	private String numero;
	
	public DocumentoCnpj(String numero) {
		this.setNumero(numero);
	}

	@Override
	public void setNumero(String numero) {
		if(numero == null || numero.trim().length() != 14) {
			throw new NumberFormatException("O CNPJ deve ter 14 dígitos");
		}
		this.numero = numero;
	}

	@Override
	public String getNumero() {
		return this.numero;
	}

	@Override
	public String toString() {
		return "CNPJ: " + this.getNumero();
	}
	
	
	
}
