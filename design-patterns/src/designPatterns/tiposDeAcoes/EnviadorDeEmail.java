package designPatterns.tiposDeAcoes;

import designPatterns.interfaces.AcaoAposGerarNota;
import designPatterns.models.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviando por e-mail");		
	}

}
