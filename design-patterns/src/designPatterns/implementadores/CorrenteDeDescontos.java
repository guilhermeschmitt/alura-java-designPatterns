package designPatterns.implementadores;

import designPatterns.interfaces.Desconto;
import designPatterns.models.Orcamento;
import designPatterns.tiposDeDesconto.DescontoParaMaisDeCincoItens;
import designPatterns.tiposDeDesconto.DescontoParaOrcamentoMaiorQueQuinhentosReais;
import designPatterns.tiposDeDesconto.DescontoPorVendaCasada;
import designPatterns.tiposDeDesconto.SemDesconto;

public class CorrenteDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoParaMaisDeCincoItens();
		Desconto d2 = new DescontoParaOrcamentoMaiorQueQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		return d1.desconta(orcamento);
	}
	
}
