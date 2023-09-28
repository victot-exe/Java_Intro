# Estruturas de repetição
__Loops de repetição, permitem a iteração de um bloco de código diversas vezes, repetem código__

## For
__Para__
* Faz com que uma variável seja testada e incrementada a cada iteração(repetição)
* `for(inicialização ; expressão boolean para validação ; incrementação){bloco de código}`
~~~
public class LoopFor {
    public static void main(String[] args) {
        
        for(int carneirinhos = 1 ; carneirinhos <= 20 ; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
    }
}
~~~
* o laço for se repete até que a expressão `boolean` recebe o valor `false`

### For em arrays
~~~
public class ForArrays {
    public static void main(String[] args) {
        
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int i=0; i < alunos.length; i++){
            System.out.printf("O aluno no indice %d é %s. \n", i, alunos[i]);
        }
    }
}
~~~
__Otimizando mais com o `forEach`__
~~~
public class ForArrays {
    public static void main(String[] args) {
        
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        for(String aluno: alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
~~~

### break & continue
__`break` interrompe o laço, enquanto o `continue` interrompe apenas a repetição atual e segue para a próxima repetição__  
~~~
public class BreakAndContinue {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i ++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        
        for(int i = 1; i <= 5; i ++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
~~~
* Enquanto o `break` interrompe todo o laço e só temos saída até o número 2, o `continue` não exibe apenas o 3

## While
__Enquanto__
* O bloco de código é executada enquanto a condição for verdadeira  
* Tomar cuidado para não criar loop infinito, onde nele a var de referência nunca será `false`
~~~
import java.util.Random;

public class LoopWhile {
    public static void main(String[] args) {
        Random gerador = new Random();
        double mesada = 50.0;

        while(mesada > 0){
            double valorDoce = gerador.nextDouble(15);
            if(valorDoce > mesada)
                valorDoce = mesada;

            mesada -= valorDoce;
            System.out.printf("Valor restante: r$ %.2f \n", mesada);
            System.out.println("-----------------");
        }

        System.out.println("Fim!");
    }
}
~~~
_Random é uma classe responsável para gerar números aleatórios_
### Do While
__A diferença entre o `do/while` e o `while` é que no do o código é executado pelo menos uma vez para depois ser verificado__
~~~
import java.util.Random;

public class LoopDoWhile{

    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            //repetir até alguem atender
            System.out.println("Tuuuuuuuu....Tuuuuuuu");
        }while(tocando());
            System.out.println("alo!!");
        
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //nega o ato de continuar tocando já que se atender não toca mais, e se toca não atendeu ainda
        return !atendeu;
    }
}
~~~

