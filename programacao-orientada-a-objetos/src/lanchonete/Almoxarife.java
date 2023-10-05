package lanchonete;

public class Almoxarife {
	
	public void contarEstoque() {
		System.out.println("Contando estoque");
	}
	
	protected void liberarIngrediente() {
		System.out.println("Pode pegar.");
	}
	
	private void fazerPedido() {
		System.out.println("Compre x ingredientes");
	}
	
	void levarXingo() {
		System.out.println("Escutando quieto!");
		this.fazerPedido();
	}
}
