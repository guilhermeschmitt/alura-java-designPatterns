package designPatterns.tiposDeEstado;

import designPatterns.interfaces.EstadoDeUmOrcamento;
import designPatterns.models.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("J� estou reprovado!");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Finalizado());
		
	}

}
