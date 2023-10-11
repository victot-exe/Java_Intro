package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> agenda;

	public AgendaContatos() {
		this.agenda = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		this.agenda.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(this.agenda);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> pesquisaPorNome = new HashSet<>();
		for(Contato c: this.agenda) {
			if(c.getNome().startsWith(nome)){
				pesquisaPorNome.add(c);
			}
		}
		return pesquisaPorNome;
	}
	
	public Contato atualizarNumero(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c: this.agenda) {
			if(c.getNome().equalsIgnoreCase(nome)){
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
				}
			}
		return contatoAtualizado;
	}
	
	  public static void main(String[] args) {
		    // Criando uma instância da classe AgendaContatos
		    AgendaContatos agendaContatos = new AgendaContatos();

		    // Exibindo os contatos no conjunto (deve estar vazio)
		    agendaContatos.exibirContatos();

		    // Adicionando contatos à agenda
		    agendaContatos.adicionarContato("João", 123456789);
		    agendaContatos.adicionarContato("Maria", 987654321);
		    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
		    agendaContatos.adicionarContato("Ana", 88889999);
		    agendaContatos.adicionarContato("Fernando", 77778888);
		    agendaContatos.adicionarContato("Carolina", 55555555);

		    // Exibindo os contatos na agenda
		    agendaContatos.exibirContatos();

		    // Pesquisando contatos pelo nome
		    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

		    // Atualizando o número de um contato
		    Contato contatoAtualizado = agendaContatos.atualizarNumero("Carolina", 44443333);
		    System.out.println("Contato atualizado: " + contatoAtualizado);

		    // Exibindo os contatos atualizados na agenda
		    System.out.println("Contatos na agenda após atualização:");
		    agendaContatos.exibirContatos();
		  }
}
