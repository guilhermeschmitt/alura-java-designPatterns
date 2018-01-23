package designPatterns.teste;

import java.util.ArrayList;

import designPatterns.builders.NotaFiscalBuilder;
import designPatterns.interfaces.AcaoAposGerarNota;
import designPatterns.models.ItemDaNota;
import designPatterns.models.NotaFiscal;
import designPatterns.tiposDeAcoes.EnviadorDeEmail;
import designPatterns.tiposDeAcoes.Multiplicador;
import designPatterns.tiposDeAcoes.NotaFiscalDao;

public class TesteObserver {

	public static void main(String[] args) {
		ArrayList<AcaoAposGerarNota> lista = new ArrayList<AcaoAposGerarNota>();
		lista.add(new EnviadorDeEmail());
		lista.add(new NotaFiscalDao());
		lista.add(new Multiplicador(5));
		NotaFiscalBuilder builder = new NotaFiscalBuilder(lista);
		//builder.adicionaAcao(new EnviadorDeEmail());
		//builder.adicionaAcao(new NotaFiscalDao());
		//builder.adicionaAcao(new Multiplicador(5));

		NotaFiscal notaFiscal = builder.paraEmpresa("Caelum").comCNPJ("123.456.789/0001-10")
				.comItem(new ItemDaNota("item 1", 100.0)).comItem(new ItemDaNota("item 2", 200.0))
				.comItem(new ItemDaNota("item 3", 300.0)).comObservacoes("entregar notaFiscal pessoalmente")
				.constroi();
		
		System.out.println(notaFiscal);
	}

}
