package br.org.cremesp.figuras;

public class Retangulo extends Figura {
	
	private double altura;
	private double base;

	public Retangulo(double altura, double base) {
		super();
		this.setBase(base);
		this.setAltura(altura);
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return this.getBase() * this.getAltura();
	}
	
	

}
