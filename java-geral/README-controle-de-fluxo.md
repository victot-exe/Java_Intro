# Controle de fluxo
__Possibilita a escolha de um bloco de código a ser executado quando  as condições são ou não satisfeitas__

## Condicional simples
__Ocorre uma validação de execução de fluxo apenas quando a condição for positiva__
~~~
    public static void main(String[] args) {
/*Caixa eletrônico*/
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
        }
        System.out.println(saldo);
    }
~~~

## Condicional composta
__Temos mais de uma opção caso a condição seja positiva ou não__
~~~
int nota = 7;

if(nota >= 7)
    System.out.println("Aproved");
else
    System.out.println("Reproved");
~~~

## Condicional encadeada
__Tem muito mais do que duas condições `if`__
~~~
public class CondicionalEncadeada {
    public static void main(String[] args) {
        
        int nota = 8;

        if(nota >= 7){
            System.out.println("Aprovado!");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
~~~

## Condição ternária
__Uma forma de abreviar o `if/else`__
~~~
public class CondicaoTernaria {
    public static void main(String[] args) {
        
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado";
        System.out.println(resultado);
    }
}
~~~
* Podendo ser encadeado + de 1 operador ternário usando os operadores lógicos `||`, `&&`

## Switch Case
__Compara o valor da var com cada caso sequencialmente, quando encontra o valor correspondente ele executa o código associado__
_Para evitar que as comparações continuem após o resultado ser encontrado use `break` no final do bloco de código_
~~~
public class SwicthCase {
    public static void main(String[] args) {
        
        String sigla = "M";
        switch(sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
~~~
