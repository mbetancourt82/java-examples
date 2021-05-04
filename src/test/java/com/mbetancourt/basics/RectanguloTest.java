package com.mbetancourt.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	@DisplayName("Test de getter y setter de Base")
	void testSetGetBase() {
		Rectangulo r = new Rectangulo();
		r.setBase(6);
		assertEquals(6, r.getBase());
	}

	@Test
	@DisplayName("Test de getter y setter de Altura")
	void testSetGetAltura() {
		Rectangulo r = new Rectangulo();
		r.setAltura(8);
		assertEquals(8,r.getAltura());
	}

	@Test
	@DisplayName("Test de CalcularArea")
	void testCalcularArea() {
		double area = 0;
		Rectangulo r = new Rectangulo(6,8);
		area = r.calcularArea();
		assertEquals(48,area);
	}

}
