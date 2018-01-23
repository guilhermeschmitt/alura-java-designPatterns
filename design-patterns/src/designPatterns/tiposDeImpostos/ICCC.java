package designPatterns.tiposDeImpostos;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;

public class ICCC extends Imposto{

	public ICCC() {
		super();
	}
	
	public ICCC(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {

		double valor = orcamento.getValor();
		if(valor < 1000) {
			return valor * 0.05 + calculaOutroImposto(orcamento); 
		}else if(valor <= 3000) {
			return valor * 0.07;
		}else {
			return valor * 0.08 + 30 + calculaOutroImposto(orcamento); 
		}
	}

	
	
}
