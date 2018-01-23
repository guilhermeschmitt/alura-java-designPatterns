package designPatterns.tiposDeImpostos;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Item;
import designPatterns.models.Orcamento;
import designPatterns.templateMethod.TemplateDeImpostoCondicional;

public class IKCV extends TemplateDeImpostoCondicional{
	
	public IKCV() {
		super();
	}
	
	public IKCV(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && algumItemMaiorQueCemReais(orcamento);
	}

	private boolean algumItemMaiorQueCemReais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()){
			if(item.getValor() > 100) return true;
		}
		return false;
	}

}
