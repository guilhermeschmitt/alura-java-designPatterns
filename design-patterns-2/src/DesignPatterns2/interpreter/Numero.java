package DesignPatterns2.interpreter;

import DesignPatterns2.visitor.Visitor;

public class Numero implements Expressao{

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
		
	}

	@Override
	public int avalia() {
		return this.numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}
	
	public int getNumero() {
		return numero;
	}
	
}
