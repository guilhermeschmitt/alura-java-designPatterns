package designPatterns.tiposDeImpostos;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;
import designPatterns.templateMethod.TemplateDeImpostoCondicional;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP() {
		super();
	}
	
	public ICPP(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() >= 500;
	}

}
