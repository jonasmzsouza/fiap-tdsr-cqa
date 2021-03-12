import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadoraDivisoes {

	/*
	 * Testes de divisões com diversas combinações de valores
	 */

	@Test
	public void testDivisoes20com4() {
		int num1 = 20;
		int num2 = 4;
		int resultadoEsperado = 5;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testDivisoes32com8() {
		int num1 = 32;
		int num2 = 8;
		int resultadoEsperado = 4;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testDivisoes125com5() {
		int num1 = 125;
		int num2 = 5;
		int resultadoEsperado = 25;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
