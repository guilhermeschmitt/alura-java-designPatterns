package designPatterns.interfaces;

import designPatterns.models.Conta;
import designPatterns.models.Requisicao;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	
}
