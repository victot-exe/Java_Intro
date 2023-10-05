package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public void addPessoa(String nome, double altura, int idade) {
		this.pessoas.add(new Pessoa(nome, altura, idade));
	}
	
	public List<Pessoa> compararPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(this.pessoas);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(this.pessoas);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	public static void main(String[] args) {
		
		OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
		pessoas.addPessoa("Nome 1", 1.56, 20);
		pessoas.addPessoa("Nome 2", 1.80, 30);
		pessoas.addPessoa("Nome 3", 1.70, 25);
		pessoas.addPessoa("Nome 4", 1.56, 17);
		
		System.out.println(pessoas.ordenarPorAltura());
		System.out.println(pessoas.compararPorIdade());
		
	}
}
