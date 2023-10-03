package util;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo"),
	RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Maranhão");
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
	
	
}