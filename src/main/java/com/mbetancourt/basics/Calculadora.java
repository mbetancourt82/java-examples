package com.mbetancourt.basics;

import java.util.List;

public class Calculadora {

	public double sumarAreas(List<FiguraGeometrica> lista) {
		int size = lista.size();
		double resultado1 = 0;
		for (int i = 0; i < size; i++) {
			resultado1 += lista.get(i).calcularArea();
		}
		return resultado1;
	}

	public double sumarAreasDeCuadrados(List<FiguraGeometrica> lista) {
		double resultado1 = 0;

		if (lista != null) {
			for (FiguraGeometrica f : lista) {
				printClassName (f);
				if( f instanceof Cuadrado) {
					
					resultado1 += f.calcularArea();
				}
			}
		}

		return resultado1;
	}
	
	public String printClassName(FiguraGeometrica f) {
		System.out.println("Class:" + f.getClass());
		return null;
	}

}
