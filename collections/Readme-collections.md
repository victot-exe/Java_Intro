# Collections frameWork API
* Uma coleção é uma estrutura de dados para agrupar muitos elementos em uma única unidade.
* Homogêneas x Heterogêneas{  
    * Homogêneas => único tipo -> Geralmente é o mais utilizado
    * Heterogêneas => mais de um tipo  
}
* Parecido com arrays
* Collectiions não aceitam tipos primitivos, apenas objetos (wrappers no lugar dos tipos primitivos)
* 4 Grandes tipos{  
    * `list`=> lista
    * `set`=> conjunto
    * `queue`=> fila
    * `map`=> dicionário com chave e valor
}

## Generics type
* Quando vc vai usar a classe para um mais de um tipo e define um tipo genérico que será alterado quando instanciar a classe.
~~~
public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
~~~
* Para definir o generics usamos o <> chamado de `diamond` ou `diamond operator`
~~~
/**
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado
*/
public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
~~~
* Os nomes de parâmetros de tipo mais comumente usados são:
    * E - Elemento (usado extensivamente pelo Java Collections Framework)
    * K - Chave
    * N - Número
    * T - Tipo
    * V - Valor
    * S, U, V, etc. - 2º, 3º, 4º tipos

## Comparable x Comparator 
### Comparable
* Uma única sequência de ordenação (id, nome, etc) => ordena a coleção com um unico elemento como base.
* Modifica a classe atual.
* `compareTO()` -> para ordenar elementos
* Está no pacote `java.lang`
* Pode ordenar os elementos usando `Collections.sort(List)`
### Comparator
* Método `compare()` para ordenar os elementos
* Multiplas sequências de ordenação
* Não afeta a classe atual
* Está em `java.util`
* Pode ordenar os elementos usando `Collections.sort(List, Comparator)`
### Colections
* A classe `Collections` é uma classe do java para operações comuns em coleções
* Métodos de ordenação, busca, manipulação e sincronização de coleções
* O método `sort()` é usado para ordenar uma lista em ordem ascendente.
* O método `sort()` em conjunto com `Collections.reverseOrder()` permite ordenar em ordem descendente.
~~~
package main.java.comparableXcomparator;

import java.util.Comparator;

// Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private int ano;

	// Construtor
	public Livro(String ti, String au, int an) {
		this.titulo = ti;
		this.autor = au;
		this.ano = an;
	}

	// Usado para ordenar livros por ano
	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);
	}

	// Métodos getters para acessar os dados privados
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}
}

// Classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
  @Override
  public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}

// Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
  @Override
  public int compare(Livro l1, Livro l2) {
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
	}
}

class CompararAnoAutorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		int ano = Integer.compare(l1.getAno(), l2.getAno());
		if (ano != 0)
			return ano;
		int autor = l1.getAutor().compareTo(l2.getAutor());
		if (autor != 0)
			return autor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}
~~~
## List
**É uma coleção ordenada que permite elementos duplicados** [Exemplos](src/list/)
* Os elementos são armazenados na ordem que colocamos
* As classes mais comuns são as `ArrayList` e a `LinkedList`
* != da Array o número de elementos não é fixo, é dinâmico.
* Usamos os índices para adicionar, remover e manipular elementos
* Métodos úteis => `sort()`, `shuffle()`, `reverse()`, `binarySearch()`

### ArrayList
* Implementa os elementos em um array redmensionável(que o tamanho pode mudar)
* Vantagem => rapidez ao acessar os elementos por meio do índice
* Adcionar elementos no meio ou começo da `list` pode demorar um pouco devido a realocação dos outros elementos.

### LinkedList
* Implementa os elementos em um array redmensionável(que o tamanho pode mudar)
* Os elementos são duplamente vinculados => cada elemento contém referências para o anterior e o próximo elemento.
* Adicionar os elementos no meio e no começo não exige realocação (é mais rápido)
* Encontrar o elemento pelo índice demora mais já que a list vai precisar ser percorrida do começo até o elemento desejado.

### Vector
* Uma aplicação antiga da `ArrayList` porém é sincronizada (thread-safe)
* Varias threads podem manipular o vetor sem causar problemas de concorrência
* A sincronização causa uma sobrecarga de desempenho
* Menos eficiente do que a `ArrayList`

## Set
**Colection que não pode conter elementos duplicados**
* Representa o conceito de conjuntos (matemática), como o baralho de cartas
* Não permite um acesso aleatório a um elemento
* Para percorrer usa iterador ou forEach

### HashSet
* Armazena os elementos em uma tabela `hash`
* Alto desempenho por usar a função hash para para idexar os elementos
* A ordem dos elementos pode não ser preservada

### TreeSet
* Armazena os elementos em uma árvore binária balanceada
* Os elementos são mantidos automaticamente em ordem crescente - Sendo assim os elementos sempre são retornados na ordem classificada
* Busca e inserção mais lentos se comparado ao HashSet

### LinkedHashSet
* É uma implementação que mantém a ordem de inserção e usa uma tabela hash para obter o desempenho de busca
