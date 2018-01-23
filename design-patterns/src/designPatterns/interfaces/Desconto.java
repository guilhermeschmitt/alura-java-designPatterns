package designPatterns.interfaces;

import designPatterns.models.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);

}
