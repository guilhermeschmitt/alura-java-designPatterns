package DesignPatterns2.Command;

import java.util.Calendar;

public class Pedido {

	private String cliente;
	private Double valor;
	private Status status;
	private Calendar dataDeFinalizacao;

	public Pedido(String cliente, Double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void paga() {
		this.status = Status.PAGO;
	}
	
	public void finaliza() {
		this.dataDeFinalizacao = Calendar.getInstance();
		this.status = Status.ENTREGUE;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	
}
