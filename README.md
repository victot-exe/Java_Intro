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
