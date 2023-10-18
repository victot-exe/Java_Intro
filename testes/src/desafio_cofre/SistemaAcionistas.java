package desafio_cofre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class SistemaAcionistas {

	public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInicial = df.parse(dataInicialStr);
		Date dataFinal = df.parse(dataFinalStr);
		List<Analise> datasFiltradas = new ArrayList<>();

		// Simula uma base da dados em uma lista de análises:
		List<Analise> analises = new ArrayList<>();
		analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
		analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
		analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
		analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
		analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
		analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));
		
		Predicate<Analise> listarDatas = a ->{
			return a.data.before(dataFinal) && a.data.after(dataInicial);
		};

		// TODO: Implemente o filtro das análises dentro do período especificado. Dica:
		// Crie uma lista para armazenar as análises filtradas e use um loop for para
		// filtrar as análises.
		analises.stream().filter(a ->a.data.before(dataFinal)).filter(a -> a.data.after(dataInicial)).forEach(System.out::println);

		// TODO: Retorne a lista de análises filtradas.
		return new ArrayList<>();
	}
}
