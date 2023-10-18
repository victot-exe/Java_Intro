package samples;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javaScript", "C#", "go", "ruby");

        palavras.stream().filter(
            p -> p.length() > 5
        ).forEach(System.out::println );
    }
}
