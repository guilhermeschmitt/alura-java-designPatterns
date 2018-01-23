package designPatterns.tiposDeEstado;

import designPatterns.interfaces.EstadoDeUmOrcamento;
import designPatterns.models.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");		
	}

}
