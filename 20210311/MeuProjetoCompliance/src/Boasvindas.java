class Boasvindas {
	
	private String menssagem;

	// Construtor de Objeto na Classe
	public Boasvindas() {
	}
	
	public Boasvindas(String mens) {
		this.menssagem = mens;
	}

	// Exibi��o da mensagem
	public String exibirMenssagem() {
		System.out.println(this.menssagem);
		return this.menssagem;
	}

	// Exibi��o da parte fixa da mensagem
	public String completarMenssagem() {
		String compmens;
		compmens = "Ola! Seja bem vindo a sua calculadora pessoal";
		System.out.println(compmens);
		return compmens;
	}
}