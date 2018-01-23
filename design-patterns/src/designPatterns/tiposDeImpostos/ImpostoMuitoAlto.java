package designPatterns.tiposDeImpostos;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto() {
		super();
	}
	
	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}

}
