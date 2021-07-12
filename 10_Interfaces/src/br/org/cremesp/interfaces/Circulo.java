package br.org.cremesp.interfaces;

public class Circulo implements Figura{
	
	private double raio;
	

	public Circulo(double raio) {
		super();
		this.setRaio(raio);
	}


	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI *  Math.pow(this.getRaio(), 2);
	}

}
