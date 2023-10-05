package list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private double altura;
	private int idade;
	
	public Pessoa(String nome, double altura, int idade) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa p) {
		return Integer.compare(this.idade, p.idade);
	}
	
	public String getNome() {
		return nome;
	}

	public double getAltura() {
		return altura;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "\nPessoa [nome=" + nome + ", altura=" + altura + ", idade=" + idade + "]";
	}
	
	
}

class ComparatorPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
}
