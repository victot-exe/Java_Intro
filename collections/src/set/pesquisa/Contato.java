package set.pesquisa;

import java.util.Objects;

public class Contato {
	
	private String nome;
	private int numeroTelefone;
	
	public Contato(String nome, int numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}

	public final String getNome() {
		return nome;
	}

	public final int getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public void setNumero(int numero) {
		this.numeroTelefone = numero;
	}

	@Override
	public String toString() {
		return "Contato " + nome + ""
				+ " =>" + numeroTelefone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
}
