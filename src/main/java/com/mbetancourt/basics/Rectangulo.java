package com.mbetancourt.basics;

public class Rectangulo implements FiguraGeometrica{
	private double base;
	private double altura;
	
	
	public Rectangulo() {
		super();
	}


	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	

}
