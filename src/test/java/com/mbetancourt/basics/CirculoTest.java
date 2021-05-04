package com.mbetancourt.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	@DisplayName("Test de getter")
	void testGetRadio() {
		Circulo c = new Circulo(5);
		assertEquals(5, c.getRadio());
	}

	@Test
	@DisplayName("Test de setter")
	void testSetRadio() {
		Circulo c = new Circulo();
		c.setRadio(4);
	}

	@Test
	void testCalcularArea() {
		double area =0;
		Circulo c = new Circulo(4);
		area=c.calcularArea();
		assertEquals(39.478417604357434475337963999505,area);
		
	}

}
