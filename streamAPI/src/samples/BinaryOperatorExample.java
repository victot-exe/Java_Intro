package samples;

import java.util.Arrays;
import java.util.List;

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
