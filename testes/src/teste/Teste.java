package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import desafio_cofre.Analise;

public class Teste {
	
	void addData(List<Analise> a) {
		datasFiltradas.addAll(a);
	}

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInicial = df.parse("01/01/2022");
		Date dataFinal = df.parse("30/07/2023");
		
		Predicate<Analise> listarDatas= a ->{
			return a.data.before(dataFinal) && a.data.after(dataInicial);
		};
		List<Analise> datasFiltradas = new ArrayList<>(null);
		
		List<Analise> analises = new ArrayList<>();
		analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));//
		analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));//
		analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));//
		analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
		analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));//
		analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));
		
		analises.stream().filter(listarDatas);
//		analises.stream().filter(listarDatas);
	}
}
