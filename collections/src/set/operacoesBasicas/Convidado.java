package set.operacoesBasicas;

public class Convidado {
	
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int código) {
		this.nome = nome;
		this.codigoConvite = código;
	}
	
	public String getNome() {
		return nome;
	}
	public int getCodigo() {
		return codigoConvite;
	}

	@Override
	public String toString() {
		return "\nConvidado [nome=" + nome + ", código=" + codigoConvite + "]";
	}
	
}
