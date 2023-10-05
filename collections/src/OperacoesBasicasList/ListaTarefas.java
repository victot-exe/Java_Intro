package OperacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adcionarTarefa(String descricao) {

		this.tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao){
		
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : this.tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
			
			this.tarefaList.removeAll(tarefasParaRemover);
		}
	}
	
	public int obterNumeroTotalTarefas() {
		return this.tarefaList.size();
	}
	
	public void obterDescricaoTarefas() {
			System.out.println(this.tarefaList);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	public static void main(String[] args) {
		
		ListaTarefas listaTarefa = new ListaTarefas();
		
		
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adcionarTarefa("victor");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adcionarTarefa("nicole");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adcionarTarefa("carol");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adcionarTarefa("gabi");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.obterDescricaoTarefas();
		
		
		listaTarefa.removerTarefa("Victor");
		
		listaTarefa.obterDescricaoTarefas();
		
	}
}
