**Linguagem de baixo nível** -> linguagem de maquina (Assembly)  
**Linguagem de alto nível** -> linguagens de programação (Python, Java...)  

## Programação estruturada
__É um paradgma de programação que visa melhorar a clareza, a qualidadae e o tempo de desenvolvimento__
* Uso extensivo das construções de fluxo(if, then, else)
* Linearidade

# Programação orientada a objetos
**Baseado no conceito de objetos, abstração de objetos do mundo real**
## Classes
* Toda a estrutura do código em Java é baseado em classes.
* Os arquivos são `NomeDaClasse.java`
* __Classe__ `class`: direciona a criação dos objetos de mesmo tipo.
* __Identificador__ `identity`: propósito dos objetos que serão criados (usar um nome claro)
* __Caracteristicas__ `states`: atributos ou propriedades (representam caracteristicas do objeto)
* __Comportamentos__ `behavior`: ações que o objeto tem, coisas que ele faz.
* __Instanciar__ `new`: quando se cria um objeto a partir de um molde (outro objeto)
### Exemplo
**Classe**: `Pessoa` => `identity`  
**Caracteristicas**{  
    raça:  
    sexo:  
    altura:  
    nome:  
}  
**Comportamentos**:{  
    andar()  
    correr()  
    comer()  
    dormir()  
}

**Instancia** menino = new Pessoa{  
    menino então vai herdar as caracteristicas e comportamentos de pessoa, podendo altera-los e adcionar novos, sendo uma variação feita a partir de um molde.  
}  


### Classificações de classes
* `model` -> Representa estrutura de domínio do app: Cliente, Pedido, Nota fiscal, etc...  
* `service` -> Regras de negócio e validação do sistema.
* `repository` -> Contém uma integração com o Banco de dados.
* `controller` -> Com finalidade de comunicação externa ao app: http, web ou webservices.
* `util` -> Contém recursos comuns para todo o app.

## Pacotes
__Forma de organização de dados__
* SubDiretórios a partir de .src
* Nomenclatura{  
    * Comercial -> com.nomeDaEmpresa
    * Governamental -> gov.nome
    * Open Source -> org.nome  
}
* Formas de dividir os diretórios{  
    * model -> representam a camada de modelo da aplicação
    * reppository -> Classes ou interfaces que tem a finalidade de interagir com o banco de dados
    * services -> Classes que contem regras de negócio, como validar um CPF
    * controler -> controlador de acesso, é onde as classes que disponibilizam os nossos recursos para outras apps
    * view -> classes de interação grafica com o user
    * util -> Classes utilitárias do sistema  
}  
* Identidicação -> Por conta dos pacotes as classes passam a ter duas identificações, o seu nome `NotaFiscal` e o nome qualificado que é o endereçamento + nome (com.controle.acesso.model.NotaFiscal)
### Package x import
* Uma classe só contem uma definição de package (1ª Linha), enquanto pode ter varios imports
~~~
package ...

import ...
import ...
public class MyClass{...}
~~~
### Modificadores de acesso / Visibilidade dos recursos
* `public` -> Modificador de acesso para deixar visivel em todas as classes do projeto.
* `protected` -> Modificador de acesso que deixa visível apenas no próprio pacote.
* `private` -> Modificador de acesso para ser visível apenas dentro da própria classe
* default || quando não coloca nada na frente -> é igual ao `protected`
~~~
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
	}
}
~~~
### Getters & Setters
* Método `getter` -> retorna o valor de algum atributo.
~~~
public double getNota(){
    return this.nota;
}
~~~  
* Método `setter` -> define o valor de algum atributo, geralmente é onde colocamos os verificadores dos valores para eles serem atribuidos aos atributos sem dar erro.
~~~
public setNota(double nota){
    this.nota = nota;
}
~~~
### Construtores
* Método construtor é o método que constrói a classe, podendo já solicitar certos parâmetros para atribuir os seus valores aos atributos no momento em que é feita a instancia da classe.
~~~
package pessoa;

public class Pessoa {
	private String name;
	private String cpf;
	private String endereco;
	
	public Pessoa(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
}
~~~
* Exemplo de classe com método construtor, no momento em que for instanciado já deverá especificar as informações
* Quando for fazer o construtor fazer somente com os atributos mais importantes
* Tambem e possivel fazer o método construtor sem receber nenhum parâmetro
~~~
package pessoa;

public class Pessoa {
	private String name;
	private String cpf;
	private String endereco;
	
	public Pessoa() {
	}
}
~~~
### Enuns
* É um tipo especial de classe onde os objetos previamente criados, imutáveis e disponíveis em todo o app
* O enum é utilizado quando o modelo de negócio contém objetos de mesmo contexto que já foram definidos com a certeza de não haver tanta alteração dos valores
~~~
package pessoa;

public enum GrauEscolaridade {
	Analfabeto, Fundamental, Médio, Superior
}
~~~
~~~
package util;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo"),
	RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Maranhão");
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

    
	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
}
~~~
* Acessando as enum's
~~~
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
~~~
## UML - Linguagem de Modelagem Unificada
* Diagramas -> representação gráfica => diagramas de classe x diagrama de objetos
* Elementos -> 
* Relacionamentos

## Pilares da POO
### Encapsulaento
**Nem tudo precisa estar visível (public, protected e private), deixar visível apenas o necessário**  
### Herança
**Caracteristicas e comportamentos comuns pode ser herdado através da hierarquia(`extends`, `implements`)**
### Abstração
**Trazer do mundo real para a programação**  
**Classes abstratas para serem implementadas depois**  
### Polimorfismo
**Varias maneiras para a mesma ação** -> cada implementação tem uma forma diferente para implementar o mesmo método  
### Interfaces
**Contratos que precisam ser cumpridos, são classes abstratas que tem métodos que devem ser implementados `implements`**
