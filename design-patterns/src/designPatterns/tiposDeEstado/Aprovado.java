package designPatterns.tiposDeEstado;

import designPatterns.interfaces.EstadoDeUmOrcamento;
import designPatterns.models.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento{

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado) {
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.02));
			descontoAplicado = true;
		}else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� em estado de aprova��o");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Finalizado());
		
	}

}
