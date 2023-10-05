package pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livrosList;
	
	//Construtor já criando uma lista vazia
	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}
	
	public void addLivro(String titulo, String autor, int anoPublicado) {
		this.livrosList.add(new Livro(titulo, autor, anoPublicado));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livroPorAutor = new ArrayList<>();
		
		//Se a lista está vazia não precisa nem começar a pesquisar
		if(!this.livrosList.isEmpty()) {
			for(Livro l: this.livrosList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
		}
		
		return livroPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervalos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorAno = new ArrayList<>();
		
		if(!this.livrosList.isEmpty()) {
			for(Livro l: this.livrosList) {
				if(l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal) {
					livrosPorAno.add(l);
				}
			}
		}
		
		return livrosPorAno;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		
		Livro livroPorTitulo = null;
		
		if(!this.livrosList.isEmpty()) {
			for(Livro l: this.livrosList) {
				if(l.getTitulo().equalsIgnoreCase(titulo))
					return l;
			}
		}
		
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		
		CatalogoLivros livros = new CatalogoLivros();
		
		livros.addLivro("Livro 1", "Autor 1", 2020);
		livros.addLivro("Livro 2", "Autor 2", 2021);
		livros.addLivro("Livro 3", "Autor 3", 2022);
		livros.addLivro("Livro 4", "Autor 4", 2023);
		livros.addLivro("Livro 5", "Autor 5", 1994);
		livros.addLivro("Livro 1", "Autor 1", 2003);
		
		System.out.println(livros.pesquisarPorTitulo("Livro 1"));
	}
	
	
}
