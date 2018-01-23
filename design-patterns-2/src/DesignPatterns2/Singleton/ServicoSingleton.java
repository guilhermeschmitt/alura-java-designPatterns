package DesignPatterns2.Singleton;

public class ServicoSingleton {

	private Servico servicoInstancia;
	
	public Servico getInstancia() {
		if(servicoInstancia == null) {
			servicoInstancia = new Servico();
		}
		
		return servicoInstancia;
	}
	
}
