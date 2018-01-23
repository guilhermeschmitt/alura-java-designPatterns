package designPatterns.templateMethod;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateDeImpostoCondicional() {
    }

	//Agora ele não pode ser sobreescrito pelas classes filhas
	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento)  + calculaOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento)  + calculaOutroImposto(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
