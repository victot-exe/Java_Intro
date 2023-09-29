# Tratamento de exceções
__Fluxo inexperado da aplicação__
* cria uma estrutura `try` -> que é a instrução que pode gerar o erro
* a estrutura `catch` -> que é responsável por tratar o erro
* a estrutura `finally` -> ela é executada independente de ter um erro ou não
~~~
try{
    bloco de código
}catch(Exception e){-> parte que vai especificar qual a exceção esperada, podendo ter um catch para cada tipo de `Exception`
    bloco de código
}finally{
    bloco de código
}
~~~
* `try` & `catch` sempre vem em pares, o `finally` é opcional
~~~
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes{
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        int idade = 0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        nome = scanner.next();
        System.out.println();
        
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.next();
        System.out.println();
        
        try{
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println();
        }catch(InputMismatchException e){
            System.out.print("Idade deve ser um valor numérico inteiro: ");
        }
        
        System.out.printf("Olá, me chamo %s %s, tenho %d anos e minha altura.", nome.toUpperCase(), sobrenome.toUpperCase(), idade);

        scanner.close();

    }
}
~~~
## Hierarquia de Exceções
__As `Excepions` são divididas em duas classes, `Checked` & `Unchecked`.__
* `checked`->
* `unchecked`->
* Exceções customizadas ->
