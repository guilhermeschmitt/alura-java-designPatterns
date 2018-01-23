package DesignPatterns2.interpreter;

import DesignPatterns2.visitor.Visitor;

public class Multiplicacao implements Expressao{

	private Expressao direita;
	private Expressao esquerda;

	public Multiplicacao(Expressao direita, Expressao esquerda) {
		this.direita = direita;
		this.esquerda = esquerda;
		
	}
	
	@Override
	public int avalia() {
		return this.direita.avalia() * this.esquerda.avalia();
	}
	
	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaMultiplicacao(this);
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

}
