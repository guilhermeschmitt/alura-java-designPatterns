package designPatterns.interfaces;

import designPatterns.models.Orcamento;

public interface EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento);
	public void aprova(Orcamento orcamento);
	public void reprova(Orcamento orcamento);
	public void finaliza(Orcamento orcamento);
	
}
