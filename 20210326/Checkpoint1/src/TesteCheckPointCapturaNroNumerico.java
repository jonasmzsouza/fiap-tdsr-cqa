import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TesteCheckPointCapturaNroNumerico {

	@Test
	public void testCapturaNroNumerico() throws IOException {

		int resultadoEsperado = 1;
		int resultadoReal = CheckPoint.capturaNro((char) 0);
		assertEquals(resultadoEsperado, resultadoReal);

	}

}
