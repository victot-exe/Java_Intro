# Stream API
__Manipulação de collections para java seguindo os princípios do paradigma funcional__
## Lambda Expressions
* Representam interfaces funcionais(interfaces com um único método abstrato) de forma que possibilita escrever o código em estilo funcional
* declaração `argumento -> corpo`
## Method Reference
__Recurso que permite que seja referênciado um método ou um construtor de uma outra classe de forma funcional__
* forma mais simples de escrever uma lambda
### Consumer
~~~
public class ConsumerExemple {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		
		numeros.stream().forEach(imprimirNumeroPar);
	}
}
~~~
* Consumer \<Tipo aceito> nome = var -> {bloco de código com retorno `void`}
* Usando Lambdas para o consumer
~~~
numeros.stream().forEach(n -> {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		});
~~~
### Suplier
* Não aceita argumentos e retorna um tipo /<T>
~~~
public class SuplierExample {
	
	public static void main(String[] args) {
		
		Supplier<String> saudacao = () -> "Olá, seja bem vindo!";
		
		List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		
		listaSaudacoes.forEach(System.out::println);
	}
}
~~~
### Function
* Representa uma função que recebe um Tipo \<T> e retorna um Tipo \<R>
* Usado pra transformar ou mapear os elementos do stream