package designPatterns.tiposDeImpostos;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;

public class ICMS extends Imposto{

	public ICMS() {
		super();
	}
	
	public ICMS(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50 + calculaOutroImposto(orcamento);
	}

}
