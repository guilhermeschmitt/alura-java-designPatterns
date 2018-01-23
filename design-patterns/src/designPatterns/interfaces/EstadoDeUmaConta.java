package designPatterns.interfaces;

import designPatterns.models.Conta;

public interface EstadoDeUmaConta {

	public void deposito(Conta conta, double valor);
	public void saque(Conta conta, double valor);
	
}
