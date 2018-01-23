package designPatterns.tiposDeRespostas;

import designPatterns.interfaces.Resposta;
import designPatterns.models.Conta;
import designPatterns.models.Formato;
import designPatterns.models.Requisicao;

public class RespostaEmCSV implements Resposta {

	private Resposta outraResposta;
	
	public RespostaEmCSV(Resposta outraResposta) {
        this.outraResposta = outraResposta;
      }

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}

}
