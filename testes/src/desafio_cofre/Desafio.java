package desafio_cofre;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Desafio{

	public static void main(String[] args) throws ParseException {
		// Lê os dados de Entrada conforme descrito neste Desafio.
		Scanner scanner = new Scanner(System.in);
		String dataInicial = scanner.nextLine();
		String dataFinal = scanner.nextLine();

		SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
		List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

		for (String analise : analises) {
			System.out.println(analise);
		}
		
		scanner.close();
	}
}