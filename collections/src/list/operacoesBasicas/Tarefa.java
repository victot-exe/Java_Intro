package list.operacoesBasicas;

public class Tarefa {

	private String descricao;
	
	public Tarefa(String descricao) {
		
		this.setDescricao(descricao);
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tarefa{" +
				"descrição='" + this.descricao + '\'' +
				'}';
	}
}
