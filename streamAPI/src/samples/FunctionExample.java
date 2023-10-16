package samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		Function<Integer, Integer> dobrar = num -> num * 2;
		
		List<Integer> dobro = numeros.stream().map(dobrar).toList();
		
		dobro.forEach(System.out::println);
	}
}
