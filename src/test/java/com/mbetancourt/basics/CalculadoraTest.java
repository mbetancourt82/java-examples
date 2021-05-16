package com.mbetancourt.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Test de SumarAreas")
	void testSumarAreas() {
		Calculadora c = new Calculadora();
		Cuadrado cuadrado = new Cuadrado(4);
		Circulo circulo = new Circulo(5);
		Rectangulo rectangulo = new Rectangulo(3,5);
		List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		lista.add(cuadrado);
		lista.add(circulo);
		lista.add(rectangulo);
		
		double resultado=0;
		resultado=c.sumarAreas(lista);
		assertEquals(80.3480220054468, resultado);
		
	}
	
	
	@Test
	@DisplayName("Test de SumarAreas de Cuadrados")
	void testSumarAreasDeCuadrados() {
		Calculadora calculadora = new Calculadora();
		Cuadrado cuadrado = new Cuadrado(4);
		Circulo circulo = new Circulo(5);
		Rectangulo rectangulo = new Rectangulo(3,5);
		List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		lista.add(cuadrado);
		lista.add(circulo);
		lista.add(rectangulo);
		
		double resultado=0;
		resultado=calculadora.sumarAreasDeCuadrados(lista);
		assertEquals(16.0d, resultado);
		
	}
	
	
	

	
}
