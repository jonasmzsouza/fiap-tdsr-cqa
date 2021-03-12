import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadoraSomas {
	
	/*
	 * Testes de somas com diversas combinações de valores
	 */

	@Test
	public void testSoma2com2() {
		int num1 = 2;
		int num2 = 2;
		int resultadoEsperado = 4;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testSoma10com5() {
		int num1 = 10;
		int num2 = 5;
		int resultadoEsperado = 15;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testSoma25com101() {
		int num1 = 25;
		int num2 = 101;
		int resultadoEsperado = 126;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}	

}
