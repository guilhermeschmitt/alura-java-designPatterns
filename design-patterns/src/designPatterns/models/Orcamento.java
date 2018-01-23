package designPatterns.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import designPatterns.interfaces.EstadoDeUmOrcamento;
import designPatterns.tiposDeEstado.EmAprovacao;

public class Orcamento {

	private double valor;
	private List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
      }

      public void aprova() {
        estadoAtual.aprova(this);
      }

      public void reprova() {
        estadoAtual.reprova(this);
      }

      public void finaliza() {
        estadoAtual.finaliza(this);
      }

	public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}


}
