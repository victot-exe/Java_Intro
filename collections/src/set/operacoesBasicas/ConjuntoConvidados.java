package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadosSet;
	
	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		this.convidadosSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorConvite(int codigoConvite) {
		Convidado convidadoRemover = null;
		
		for(Convidado c : this.convidadosSet) {
			if(c.getCodigo() == codigoConvite) {
				convidadoRemover = c;
				break;
			}
		}
		this.convidadosSet.remove(convidadoRemover);
	}
	
	public int contarConvidados() {
		return this.convidadosSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(this.convidadosSet);
	}
	
	public static void main(String[] args) {
		
		 // Criando uma instância da classe ConjuntoConvidados
	    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

	    // Exibindo o número de convidados no conjunto (deve ser zero)
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

	    // Adicionando convidados ao conjunto
	    conjuntoConvidados.adicionarConvidado("Alice", 1234);
	    conjuntoConvidados.adicionarConvidado("Bob", 1235);
	    conjuntoConvidados.adicionarConvidado("Charlie", 1235);
	    conjuntoConvidados.adicionarConvidado("David", 1236);

	    // Exibindo os convidados no conjunto
	    System.out.println("Convidados no conjunto:");
	    conjuntoConvidados.exibirConvidados();

	    // Exibindo o número atualizado de convidados no conjunto
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

	    // Removendo um convidado do conjunto por código de convite
	    conjuntoConvidados.removerConvidadoPorConvite(1236);
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

	    // Exibindo os convidados atualizados no conjunto
	    System.out.println("Convidados no conjunto após a remoção:");
	    conjuntoConvidados.exibirConvidados();
		
	}
}
