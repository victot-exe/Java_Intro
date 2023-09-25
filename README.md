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
