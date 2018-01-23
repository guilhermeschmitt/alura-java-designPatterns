package designPatterns.tiposDeImpostos;
import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;

public class ISS extends Imposto{

	public ISS() {
		super();
	}
	
	public ISS(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
