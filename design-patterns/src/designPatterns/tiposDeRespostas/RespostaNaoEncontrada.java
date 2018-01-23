package designPatterns.tiposDeRespostas;

import designPatterns.interfaces.Resposta;
import designPatterns.models.Conta;
import designPatterns.models.Requisicao;

public class RespostaNaoEncontrada implements Resposta{

	@Override
	public void responde(Requisicao req, Conta conta) {
		System.out.println("Resposta não encontrada!");
	}

}
