package designPatterns.tiposDeEstado;

import designPatterns.interfaces.EstadoDeUmaConta;
import designPatterns.models.Conta;

public class Negativo implements EstadoDeUmaConta{

	@Override
	public void deposito(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (conta.getSaldo() * 0.95));
		if(conta.getSaldo() >= 0) {
			conta.setEstadoDeUmaConta(new Positivo());
		}
	}

	@Override
	public void saque(Conta conta, double valor) {
		throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
	}

}
