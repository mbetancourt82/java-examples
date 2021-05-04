package com.mbetancourt.basics;

public class Cuadrado implements FiguraGeometrica {

	private double lado;

	public Cuadrado() {
		super();
	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double a = lado * lado;
		return a;
	}

}
