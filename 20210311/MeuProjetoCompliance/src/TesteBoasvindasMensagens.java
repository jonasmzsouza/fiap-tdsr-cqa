import static org.junit.Assert.*;

import org.junit.Test;

public class TesteBoasvindasMensagens {

	@Test
	public void testBoasVindasExibirMensagem() {
		String mensagem = "Seja bem vindo!";
		Boasvindas bv = new Boasvindas(mensagem);
		assertEquals(mensagem, bv.exibirMenssagem());
	}
	
	@Test
	public void testBoasVindasCompletarMensagem() {
		String mensagem = "Ola! Seja bem vindo a sua calculadora pessoal";
		Boasvindas bv = new Boasvindas();
		assertEquals(mensagem, bv.completarMenssagem());
	}	

}