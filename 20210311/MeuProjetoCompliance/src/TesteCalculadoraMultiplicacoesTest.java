import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadoraMultiplicacoesTest {

	/*
	 * Testes de multiplicações com diversas combinações de valores
	 */

	@Test
	public void testMultiplicacoes15com3() {
		int num1 = 15;
		int num2 = 3;
		int resultadoEsperado = 45;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.multiplicar(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testMultiplicacoes14com6() {
		int num1 = 14;
		int num2 = 6;
		int resultadoEsperado = 84;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.multiplicar(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testMultiplicacoes33com9() {
		int num1 = 33;
		int num2 = 9;
		int resultadoEsperado = 297;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.multiplicar(num1, num2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
