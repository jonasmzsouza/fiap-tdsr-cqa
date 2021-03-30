import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TesteCkeckPointCapturaNroNaoNumerico {

	@Test
	public void testCapturaNroNaoNumerico() throws IOException {

		int resultadoEsperado = 2;
		int resultadoReal = CheckPoint.capturaNro((char) 0);
		assertEquals(resultadoEsperado, resultadoReal);

	}

}