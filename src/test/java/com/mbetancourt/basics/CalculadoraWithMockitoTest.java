package com.mbetancourt.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



class CalculadoraWithMockitoTest {


	//@Test
	@DisplayName("Test de Sumar áreas de Cuadrados")
	void testSumarAreasDeCuadrados() {
		// given
		Calculadora calculadora = new Calculadora();
		Cuadrado cuadrado1 = Mockito.mock(Cuadrado.class);
		Cuadrado cuadrado2 = Mockito.mock(Cuadrado.class);
		Cuadrado cuadrado3 = Mockito.mock(Cuadrado.class);
		List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		lista.add(cuadrado1);
		lista.add(cuadrado2);
		lista.add(cuadrado3);
		// when
         Mockito.when(cuadrado1.calcularArea()).thenReturn(25.0d);
         Mockito.when(cuadrado2.calcularArea()).thenReturn(16.0d);
         Mockito.when(cuadrado3.calcularArea()).thenReturn(4.0d);
		// then
         double resultado = 0;
         resultado = calculadora.sumarAreasDeCuadrados(lista);
         assertEquals(45.0d, resultado);
		
	}
	
	
	@Test
	@DisplayName("Test de Sumar áreas de Cuadrados con spy")
	void testSumarAreasDeCuadrados2() {
		// given
		//Calculadora calculadora = new Calculadora();
		Calculadora calculadoraSpy = Mockito.spy(Calculadora.class);
		Cuadrado cuadrado1 = Mockito.mock(Cuadrado.class);
		Cuadrado cuadrado2 = Mockito.mock(Cuadrado.class);
		Cuadrado cuadrado3 = Mockito.mock(Cuadrado.class);
		List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		lista.add(cuadrado1);
		lista.add(cuadrado2);
		lista.add(cuadrado3);

		// when
         Mockito.when(cuadrado1.calcularArea()).thenReturn(25.0d);
         Mockito.when(cuadrado2.calcularArea()).thenReturn(16.0d);
         Mockito.when(cuadrado3.calcularArea()).thenReturn(4.0d);
         Mockito.doReturn(null).when(calculadoraSpy).printClassName(cuadrado1);

       // then
         double resultado = 0;
         resultado = calculadoraSpy.sumarAreasDeCuadrados(lista);
         assertEquals(45.0d, resultado);
		
	}
	
	
	//@Test
	@DisplayName("Test de Sumar áreas de Cuadrados con spy")
	void testSumarAreasDeCuadrados3() {
		// given
		Calculadora calculadora = new Calculadora();
		Calculadora calculadoraSpy = Mockito.spy(calculadora);
		Cuadrado cuadrado1 = Mockito.mock(Cuadrado.class);
		Cuadrado cuadrado2 = Mockito.mock(Cuadrado.class);
		Cuadrado cuadrado3 = Mockito.mock(Cuadrado.class);
		List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		lista.add(cuadrado1);
		lista.add(cuadrado2);
		lista.add(cuadrado3);

		// when
         Mockito.when(cuadrado1.calcularArea()).thenReturn(25.0d);
         Mockito.doReturn(null).when(calculadoraSpy).printClassName(Mockito.any(FiguraGeometrica.class));
       // then

         double resultado = 0;
         resultado = calculadoraSpy.sumarAreasDeCuadrados(lista);
         assertEquals(25.0d, resultado);
		
	}

}
