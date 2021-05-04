package com.mbetancourt.basics;

import java.util.ArrayList;
import java.util.List;


public class Calculadora {

	public static void main(String[] args){
		Calculadora c = new Calculadora();
		Cuadrado cuadrado = new Cuadrado(4);
		Circulo circulo = new Circulo(5);
		Rectangulo rectangulo = new Rectangulo(3,5);
		List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		lista.add(cuadrado);
		lista.add(circulo);
		lista.add(rectangulo);
		
		double resultado=0;
		resultado= c.sumarAreas(lista);
		System.out.println(resultado);
	}
	
	public double sumarAreas(List<FiguraGeometrica> lista) {
		int size = lista.size();
		double resultado1 = 0;
		for(int i=0;i<size;i++) {
			resultado1 = resultado1 + lista.get(i).calcularArea();
		}
		return resultado1;
	}

}
