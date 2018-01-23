package DesignPatterns2.Command;

public class FinalizaPedido implements Comando{

	private Pedido p;

	public FinalizaPedido(Pedido p) {
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Finalizando o pedido do cliente " + p.getCliente());
		p.finaliza();
	}

}
