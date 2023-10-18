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
~~~
public class ConsumerExemple {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
//		Consumer<Integer> imprimirNumeroPar = numero -> {
//			if(numero % 2 == 0) {
//				System.out.println(numero);
//			}
//		};
		
		numeros.stream().forEach(n -> {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		});
	}
}
~~~
### Predicate
* Recebe um tipo \<T> e retorna um `boolean`
* Filtra elementos com base em uma condição
~~~
public class PredicateExample {
    
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javaScript", "C#", "go", "ruby");

        palavras.stream().filter(
            p -> p.length() > 5
        ).forEach(System.out::println );
    }
}
~~~
### BinaryOperator
* Recebe dois argumentos de mesmo tipo \<T> e retorna um uníco valor
* É usado para redução em pares dos elementos
~~~
public class BinaryOperatorExample {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        int resultado = numeros.stream().reduce(0,
            (a, b) -> a + b);

        int outroJeito = numeros.stream().reduce(0, Integer::sum);

        System.out.println("Jeito 1 " + resultado);
        System.out.println("Jeito 2 " + outroJeito);
    }
}
~~~
### Optional
* Oferece uma bordagem para evitar a `nullPointerException`
* A classe permite encapsular o que pode ter o valor nulo dentro dela, indicando que o valor pode estar ou não presente no código


## As operações na Stream API podem ser classificadas em duas categorias principais: 
1. Operações Intermediárias: são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados. São elas:
- `filter(Predicate<T> predicate)`: Filtra os elementos da Stream com base em um predicado. Retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado.
Exemplo: ` stream.filter(n -> n > 5)`
- `map(Function<T, R> mapper)`: Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes.
Exemplo: `stream.map(s -> s.toUpperCase())`
- `sorted()`: Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido.
Exemplo: `stream.sorted()`
- `distinct()`: Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação.
Exemplo: `stream.distinct()`
- `limit(long maxSize)`: Limita o número de elementos da Stream aos maxSize primeiros elementos
Exemplo: stream.limit(10)
- `skip(long n)`: Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles.
Exemplo: `stream.skip(5)`
2. Operações Terminais: são aquelas que encerram o pipeline e produzem um resultado final. São elas:
- `forEach(Consumer<T> action)`: Executa uma ação para cada elemento da Stream.
Exemplo: `stream.forEach(System.out::println)`
- `toArray()`: Converte a Stream em um array contendo os elementos da Stream.
Exemplo: `stream.toArray()`
- `collect(Collector<T, A, R> collector)`: Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa.
Exemplo: stream.collect(Collectors.toList())
- `count()`: Retorna o número de elementos na Stream.
Exemplo: `stream.count()`
- `anyMatch(Predicate<T> predicate)`: Verifica se algum elemento da Stream atende ao predicado especificado.
Exemplo: `stream.anyMatch(s -> s.startsWith("A"))`
- `allMatch(Predicate<T> predicate)`: Verifica se todos os elementos da Stream atendem ao predicado especificado.
Exemplo: `stream.allMatch(n -> n > 0)`
- `noneMatch(Predicate<T> predicate)`: Verifica se nenhum elemento da Stream atende ao predicado especificado.
Exemplo: stream.noneMatch(s -> s.isEmpty())
- `min(Comparator<T> comparator)` e `max(Comparator<T> comparator)`: Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido.
Exemplo: `stream.min(Comparator.naturalOrder())` ou `stream.max(Comparator.naturalOrder())`
- `reduce(T identity, BinaryOperator<T> accumulator)`: Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final.
Exemplo: `stream.reduce(0, (a, b) -> a + b)`

## Lambda

- As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.
- As interfaces funcionais desempenham um papel crucial na programação funcional em Java, pois servem de base para o uso de expressões lambda.
- Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador
de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.
- As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).
