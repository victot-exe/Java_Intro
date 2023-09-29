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
        
        System.out.printf("Olá, me chamo %s %s, minha idade é %d anos.", nome.toUpperCase(), sobrenome.toUpperCase(), idade);

        scanner.close();

    }
}