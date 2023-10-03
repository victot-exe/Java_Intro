package IBGE;

import util.EstadoBrasileiro;

public class SistemaIBGE {
	
	public static void main(String[] args) {
		
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.printf("%s - %s \n", e.getSigla(), e.getNome());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
		
		System.out.println(eb.getNome());
	}
}
