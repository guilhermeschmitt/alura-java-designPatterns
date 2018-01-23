package designPatterns.tiposDeInvestimento;

import designPatterns.interfaces.Investimento;
import designPatterns.models.Conta;

public class Conservador implements Investimento{

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
