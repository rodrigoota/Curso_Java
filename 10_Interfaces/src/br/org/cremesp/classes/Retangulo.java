package br.org.cremesp.classes;

import br.org.cremesp.interfaces.Figura;

public class Retangulo implements Figura, Comparable<Retangulo> {
	
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

	@Override
	public int compareTo(Retangulo o) {
		Double d1 = this.calcularArea();
		Double d2 = o.calcularArea();
		
		return d1.compareTo(d2);
	}
	
	

}
