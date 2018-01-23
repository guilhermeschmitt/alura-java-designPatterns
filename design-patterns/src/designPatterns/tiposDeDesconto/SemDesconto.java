package designPatterns.tiposDeDesconto;

import designPatterns.interfaces.Desconto;
import designPatterns.models.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
	}

}
