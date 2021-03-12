import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadoraSubtracoes {

	/*
	 * Testes de subtrações com diversas combinações de valores
	 */

	@Test
	public void testSubtracao4com8() {
		int num1 = 4;
		int num2 = 8;
		int resultadoEsperado = -4;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testSubtracao20com12() {
		int num1 = 20;
		int num2 = 12;
		int resultadoEsperado = 8;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testSubtracao73com14() {
		int num1 = 73;
		int num2 = 14;
		int resultadoEsperado = 59;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
}
