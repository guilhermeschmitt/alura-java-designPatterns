package designPatterns.tiposDeAcoes;

import designPatterns.interfaces.AcaoAposGerarNota;
import designPatterns.models.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota{

	private double fator;

	public Multiplicador(double valor) {
		this.fator = valor;
	}
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Valor da nota: "+ notaFiscal.getValorBruto() * this.fator);
		
	}

}
