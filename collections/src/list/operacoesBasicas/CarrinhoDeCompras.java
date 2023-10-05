package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> carrinho = new ArrayList<>();
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		this.carrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		
		List<Item> remover = new ArrayList<>();
		
		for(Item i: carrinho) {
			if(nome.equalsIgnoreCase(i.getNome())) {
				remover.add(i);				
			}
		}
		System.out.println(remover);
		this.carrinho.removeAll(remover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		for(Item i: this.carrinho) {
			valorTotal += (i.getPreco() * i.getQuantidade());
		}
		
		System.out.println(valorTotal);
		
		return valorTotal;
	}
	
	public void exibirItens() {
		for(Item i: this.carrinho) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Carro", 12000.00, 1);
		carrinho.adicionarItem("Bike", 1000.00, 1);
		carrinho.adicionarItem("Moto", 7000.00, 1);
		
		carrinho.exibirItens();
		carrinho.calcularValorTotal();
		
		System.out.println("----------------------");
		
		
		carrinho.removerItem("bike");
		System.out.println("----------------------");
		
		
		carrinho.exibirItens();
		carrinho.calcularValorTotal();
		
		
		
		
	}
}
