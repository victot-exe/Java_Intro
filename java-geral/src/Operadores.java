public class Operadores {
    public static void main(String[] args) {
        int num = 5;
        num ++;
        System.out.println(num);
        num += 2;
        System.out.println(num);

        boolean variavel = true;
        System.out.println(!variavel);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        System.out.println("-------------------------------");

        int numUm = 1;
        int numDois = 2;
        
        boolean isEqual = numUm == numDois ? true : false;
        System.out.println("Os numeros são iguais? " + isEqual);
        System.out.println("Os numeros são diferentes? " + !isEqual);

        boolean numUmMaior = numUm > numDois ? true : false;
        System.out.println("NumUm é maior? " + numUmMaior);
        System.out.println("NumDois é maior? " + !numUmMaior);

        boolean condicaoUm = true;
        boolean condicaoDois = false;

        System.out.println(" && " + (condicaoUm && condicaoDois));
        System.out.println(" || " + (condicaoUm || condicaoDois));

    }
}
