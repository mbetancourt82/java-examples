package com.mbetancourt.basics;

public class Circulo implements FiguraGeometrica{
	private double radio;

	public double getRadio() {
		return radio;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public Circulo() {
		super();
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double a =0;
		a=radio*((Math.PI)*(Math.PI));
		return a;
	}

}
