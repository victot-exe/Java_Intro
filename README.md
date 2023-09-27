# Java
* O que é?  {
    * Conjunto bem defiido de funcionalidades (features)
    * Orientada a objetos (classes e objetos) - POO {
        1. Classes e objetos - Forma que se orgaiza o Java
        2. Encapsulamento - Encapsular os métodos (caixas)
        3. Astração - Abstrar coisas do mundo real
        4. Herança - Classes filhas herdando atributos e métodos da classe mãe para aplicar outros
        5. Polimorfismo - Mesmo nome para diferentes funções
    }
    * Funciona desde pequenos cenários a cenários de grande porte - qualquer plataforma - WORA (Write Once Run Anywhere)
    * O código do java é compilado para bytecode e esse bytecode é livre de qualquer plataforma
    * Robusta {
        * Forte gerenciamento de memória
        * GarbageCollector
        * Tratamento de exceptions
    }
    * Segura - Faz uma autochecagem
    * Os programas são compilados (bytecode) e a JVM(javaVirtualMachine) interpreta o bytecote
    * Multi-thread - thread = processo leve independente de um programa
}
* História
* Pesquisa da Sun Microsystems
* Baseado na linguagem C
* Primeiro nome Oak, como já existia chamaram de Java por conta de ser a cidade de origem de um café importado
* Agora é utilizada em {
    * Pagina Web
    * software de grande porte
    * Sofware destinado ao consumidor final
    * Apps mobile
}
* J2SE 5.0 -> Introdução Generics, Enum, Autoboxing, for-each, entre outros
* JAVA SE 8 -> LambdasExpressions, forEach, Consumer e interfaces no java.util.funcions, Default Methods, Method Reference
* Java SE 11 -> Metodos para ler e escrever strings em arquivos: `readString()`, `writeString()`, alguns métodos funcionais adicionados.

## IDE
integrated development environment  
* Para agilizar o desenvolvimento de código{
    * Eclipse
    * IntelliJ -> Pago
    * VSCode
    * NetBeans
}

# Estrutura de classes
~~~
public class MyClass {
    //your code in java
}
~~~
* `public` -> public diz a visibilidade da class, 99% das class serão public
* `class` -> diz que está declarando uma class (tipagem forte em java)
* o código da classe deve ficar entre as chaves{}
* class que são executáveis tem o método `main` -> `public static void main(String[] args){}`
## Nomenclatura
* Todos os arquivos .java devem começar com letra maiúscula e o nome da class deve ter o mesmo nome do arquivo
* variáveis devem ser nomeadas em camelCase
* constantes devem ser nomeada em UPPERCASE e usar `final Tipo NOME = valor`
* o nome deve conter apenas letras, _, $ ou numeros
* se inicia com letra(preferencialmente), _ ou $, nunca com números
* não pode conter espaços
* não usar palavras chave
* não repetir o nome dentro do escopo
## Declarando
### Variáveis
* `Tipo nomeDaVar = valor`
* Variaveis `final` -> precisam de um valor definido na sua declaração
### Métodos
* `TipoRetorno NomeObjetiivoInfinitivo(Parâmetros){yourCode}`
* Métodos não podem ser declarados no método main, somente dentro da classe
~~~
public class MyClass{
    
    public static String nomeCompleto(String primeiroNome, String segundoNome){
            return primeiroNome.concat(" ").concat(segundoNome);
        }
    
    public static void main(String[] args){
        
        System.out.println(nomeCompleto("Victor", "Faria"));
    }
}
~~~
__Saída ->__ `Victor Faria`

### Identação
* Tabular o código para o programa ficar mais visual de forma hierarquica
* Não interfere na compilação do código (em java)
__Code s/ identação__
~~~
public class BoletimEstudantil{
    public static void main(String[] args) {
        
        int mediaFinal = 6;
        if(mediaFinal < 6){
        System.out.println("Reprovado")
        }else if(mediaFinal == 6){
        System.out.println("Na casca");
        else{
        System.out.println("Aprovado");
        }
        }
    }
}
~~~
__Code c/ identação__
~~~
public class BoletimEstudantil{
    public static void main(String[] args) {
        
        int mediaFinal = 6;
        if(mediaFinal < 6){
            System.out.println("Reprovado")
        }else if(mediaFinal == 6){
            System.out.println("Na casca");
        else{
            System.out.println("Aprovado");
        }
        }
    }
}
~~~
* Facilita o entendimento do código e sua hierarquia
### Organizando arquivos
* Dividir em pacotes -> SubDiretorios
* comercial -> com
* organizacional -> org
* opensource -> org ou opensource por extenso mesmo
`com.nomeempresa.projeto.pacotes{depende da função da pasta app, model, etc...}`  
### Java Beans
* Estruturação de escrita para facilitar a compreenção
* variavel deve ser clara
* no singular, menos quando se referir a uma array ou collection
* utilizar apenas um idioma
~~~
double salarioMedio = 1500.23;
String email = "aluno@escola.com";
String[] emails = {"aluno@escola.com", "professor@escola.com"};
String meuNome = "Victor"
~~~
__Metodos__
* Verbo no infinitivo, camelCase e claro
~~~
abrirConexao(){}
somar(){}
findById(int id){}
~~~

## Tipos e variáveis
### 8 Tipos primitivos
__Não são objetos, por isso representam valores brutos, representados diretamente na pilha de memória (Memory stack).__  
1. `byte` -> min = -128 | max = 127 (memory 1byte)
2. `short` -> min = -32768 | max = 32767 (memory 2byte)
3. `int` -> min = -2147483648 | max = 2147483647 (memory 4byte) => tipo mais utilizado a propria vm já tenta colocar tudo em int
4. `long` -> min = -9223372036854775808 | max = 9223372036854775807 (memory 8byte)
5. `float` -> min = -3.4028E + 38 | max = 3.4028E + 38 (memory 4byte)
6. `double` -> min = -1.7976E + 308 | max = 1.7976E + 308 (memory 8byte) => tipo mais utilizado para pontos flutuantes.
7. `boolean` -> `true` ou `false`
8. `char`  -> caractere `'x'`
### Declarando variáveis
* \<tipo> \<nome> = \<atribuicaoDoValorOpcional>
~~~
int age;//sem definir a var recebe o valor default = 0
int anoFabricacao = 2021;
double salarioMinimo = 2500.33;//usa o ponto e não a virgula
~~~
* Quando se declara um `float` a var deve ser declarada -> `float pi = 3.14F` se não o programa entende que deveria ser um `double` e da erro.
* O mesmo vale para o tipo `long` só que com a letra L -> `long numero = 312L` se não o programa entende como um `int`
__Variáveis x Constantes__  
* constantes -> valores armazenados na memória que não podem ser alterados a palavra reservada para a sua declaração é `final` -> `final int UM = 1;`

## Operadores
__Simbolos especiais que estão associadas a determinadas funções__
* Operador de atribuição `=` -> atribui ou altera o valor de uma var:
~~~
String name = "Nome";
int age = 22;
double weight = 68.5;
age = 24;
~~~
### Operadores aritméticos
* `+` -> adição  
* `-` -> subtração  
* `*` -> multiplicação  
* `/` -> divisão  
* `%` -> resto de divisão/módulo
~~~
int soma = 3 + 1;
int sub = 3 - 1;
int mult = 3 * 1;
int div = 15 / 3;
int mod = 18 % 3;
double resultao = (10 * 7) + (20 / 4)
~~~
*o operador `+` quando usado em tipo `String` tem a função de concatenar (juntar) `String nomeCompleto = "Linguagem" + "Java"`*

### Operadores unários
__Aplicados junto a outro operador aritimético para realizar trabalhos básicos como: incrementar, decrementar, inverter valores e booleans__  
* `++` -> incremento
* `--` -> decremento
* `!` -> negação => inverte booleans  
*Incremento e decremento se usados antes primeiro eles usam o valor antigo e depois salvam o novo*
~~~
int num = 5;
num ++;
System.out.println(++ num);
boolean variável = false;
System.out.println(!variavel);//-> a saída é false
~~~
### Operador ternário
__Funciona como um condicional `if` de uma forma que toda a estrutura fique em uma linha__
* \<Expressão condicional> ? \<Caso `true`> : \<Caso `false`>;
~~~
int a, b;
a = 5;
b = 6;

String resultado = a == b ? "verdadeiro" : "falso";
~~~
### Operadores relacionais
__Avaliam a relação entre as variáveis e retorna um boolean como resultado__
* `==` -> igual
* `!=` -> diferente
* `>` -> maior que
* `>=` -> maior ou igual a
* `<` -> menor que
* `<=` -> menor ou igual a
~~~
int numUm = 1;
int numDois = 2;
boolean isEqual = numUm == numDois ? true : false;
boolean numUmMaior = numUm > numDois ? true : false;
~~~
*para comparar objetos é melhor utilizar o .equals() para comparar seus conteúdos*

### Operadores lógicos
__Permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões__
* `&&` -> operador lógico AND, E => `true` apenas se todos forem `true`
* `||` -> operador lógico OR, ou => `true` se pelo menos um for `true`

~~~
boolean condicaoUm = true;
boolean condicaoDois = false;

System.out.println(" && " + (condicaoUm && condicaoDois));
System.out.println(" || " + (condicaoUm || condicaoDois));
~~~

## Sintaxe de métodos
__Uma ação executada pela classe__
* O que o método deve fazer?
* Qual o retorno esperado?
* Quais os parâmetros esperados para a execução do método?
* Pode apresentar alguma `Exception`?
* Qual a visibilidade do método? _ainda vai falar sobre_

### Critérios de nomenclatura
_não obrigatórios_
* Deve ser nomeado como um verbo
* camelCase  

### Declaração de métodos
* __Em java não temos métodos globais, todo método deve pertencer a uma classe__  
* __Métodos não podem ser declarados dentro do `main`__
DeclararAClasse{

    \<visibilidade> \<tipo_de_retorno> \<nomeDoMetodo>(\<parâmetros>){  
        //\<lógica do método>  
        \<return> caso o tipo do método não for `void`  
    }  
}
~~~
public class MyClass{

    public double somar(int num1, int){
        int resultado = num1 + num2;
        return resultado;
    }
}
~~~

## Escopo
__Ambiente que a var pode ser acessada__
* Em java o escopo é o bloco onde a var foi declarada
* Se é de classe ela pode ser acessada por toda a classe, se é local (como interna de um método ela não pode ser acessada fora do mesmo)
* Identidicar a localização mais conveniente para a escrita de algoritmos necessários para o nosso programa  

## Palavras resevadas
__52 Palavras reservadas, são identificadores que já possuem uma finalidade definida e não podem ser usadas para nomear variáveis, classes, métodos ou atributos__  
* classificadas em grupos
* são todas em letras minusculas
* ficam em cor diferente na maioria das IDEs

### Controle de pacotes
* `import` -> importa classes ou pacotes para o código
* `package` -> especifica qual pacote aquela classe pertence (toda a classe pertence a um `package`)

### Modificadores de acesso
* `public` -> deixa a var ou método público
* `private` -> só deixa visível dentro da classe
* `protected` -> visível apenas no `package` e em subclasses

### Tipos primitivos
* `byte` -> min = -128 | max = 127 (memory 1byte)
* `short` -> min = -32768 | max = 32767 (memory 2byte)
* `int` -> min = -2147483648 | max = 2147483647 (memory 4byte) => tipo mais utilizado a propria vm já tenta colocar tudo em int
* `long` -> min = -9223372036854775808 | max = 9223372036854775807 (memory 8byte)
* `float` -> min = -3.4028E + 38 | max = 3.4028E + 38 (memory 4byte)
* `double` -> min = -1.7976E + 308 | max = 1.7976E + 308 (memory 8byte) => tipo mais utilizado para pontos flutuantes.
* `boolean` -> `true` ou `false`
* `char`  -> caractere `'x'`
* `void` -> indica que o método não tem retorno de valor

### Modificadores de classes, variáveis ou métodos
* `abstract` -> classe que não pode ser instanciada e precisa ser implementada por uma subclasse não abstrata
* `class` -> indica que é uma classe
* `extends` -> indica a superclasse que a subclasse está estendendo
* `final` -> define constantes(variáveis que não podem ser reiniciadas, classe não pode ser extendida, um método que não pode ser sobrescrito)
* `implements` -> indica interfaces que uma classe irá implementar
* `interface` -> indica uma interface
* `native` -> indica que um método está escrito em uma linguagem dependente de plataforma como o C
* `new` -> instancia um novo objeto, chama o construtor
* `static` -> faz uma classe pertencer a classe ao invés de as instâncias
* `strictfp` -> strict float point indica que o método, var, class seguira as regras de ponto flutuante
* `synchronized` -> indica que o método só pode ser acessado por uma thread de cada vez
* `transient` -> impede a serialização de campos
* `volatile` -> indica que uma variável pode ser alterada durante o uso de threads

### Controle de fluxo dentro de um bloco de código
* `break` -> sai do bloco de código em que ele está
* `case` -> executa um bloco de código dependendo do teste do `switch`
* `continue` -> pula o restante da repetição do loop atual e pula para a próxima repetição do loop
* parou em 8:24