package com.mbetancourt.basics;

import java.util.List;


public class Calculadora {


	
	public double sumarAreas(List<FiguraGeometrica> lista) {
		int size = lista.size();
		double resultado1 = 0;
		for(int i=0;i<size;i++) {
			resultado1 += lista.get(i).calcularArea();
		}
		return resultado1;
	}

}
