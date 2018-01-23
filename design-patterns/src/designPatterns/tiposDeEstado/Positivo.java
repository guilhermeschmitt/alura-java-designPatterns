package designPatterns.tiposDeEstado;

import designPatterns.interfaces.EstadoDeUmaConta;
import designPatterns.models.Conta;

public class Positivo implements EstadoDeUmaConta{

	@Override
	public void deposito(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (conta.getSaldo() * 0.98));
	}

	@Override
	public void saque(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
		if(conta.getSaldo() < 0) {
			conta.setEstadoDeUmaConta(new Negativo());
		}
		
	}

}
