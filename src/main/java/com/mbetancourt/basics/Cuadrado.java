package com.mbetancourt.basics;

public class Cuadrado implements FiguraGeometrica {

	private double lado;

	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("calculando área de cuadrado --------");
		double a = lado * lado;
		return a;
	}

}
