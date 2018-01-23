package designPatterns.tiposDeAcoes;

import designPatterns.interfaces.AcaoAposGerarNota;
import designPatterns.models.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");		
	}

}
