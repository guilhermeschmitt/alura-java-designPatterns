package designPatterns.tiposDeRespostas;

import designPatterns.interfaces.Resposta;
import designPatterns.models.Conta;
import designPatterns.models.Formato;
import designPatterns.models.Requisicao;

public class RespostaEmXML implements Resposta {

	private Resposta outraResposta;

	public RespostaEmXML(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			outraResposta.responde(req, conta);
		}
	}
}
