package org.cuatrovientos.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {
	Cadena cadena;
	@Test
	void testVocales() {
		assertEquals(2, cadena.vocales("hola"));
	}
	
	@Test
	void testLongitud() {
		assertEquals(4, cadena.longitud("hola"));
	}
	
	@Test
	void testInvertir() {
		assertEquals("aloh", cadena.invertir("hola"));
	}
	
	@Test
	void testContarLetra() {
		assertEquals(1, cadena.contarLetra("hola", 'a'));
	}
}
