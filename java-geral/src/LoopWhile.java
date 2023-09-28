import java.util.Random;

public class LoopWhile {
    public static void main(String[] args) {
        Random gerador = new Random();
        double mesada = 50.0;

        while(mesada > 0){
            double valorDoce = gerador.nextDouble(20);
            if(valorDoce > mesada)
                valorDoce = mesada;

            mesada -= valorDoce;
            System.out.printf("Valor restante: r$ %.2f \n", mesada);
            System.out.println("-----------------");
        }

        System.out.println("Fim!");
    }
}
