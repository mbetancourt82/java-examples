package com.mbetancourt.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuadradoTest {

	@Test
	@DisplayName("Test de constructor vac�o")
	void testCuadrado() {
		Cuadrado c = new Cuadrado();
		c.setLado(4);
	}

	@Test
	@DisplayName("Test de getter")
	void testGetLado() {
		Cuadrado c = new Cuadrado(5);
		assertEquals(5,c.getLado());
	}

	@Test
	@DisplayName("Test de setter")
	void testSetLado() {
		Cuadrado c = new Cuadrado();
		c.setLado(4);
		assertEquals(4,c.getLado());
	}

	@Test
	@DisplayName("Test de calcularArea")
	void testCalcularArea() {
		double area = 0;
		Cuadrado c = new Cuadrado(6);
		area = c.calcularArea();
		assertEquals(36, area);
	}

}
