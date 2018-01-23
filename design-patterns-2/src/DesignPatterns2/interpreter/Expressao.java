package DesignPatterns2.interpreter;

import DesignPatterns2.visitor.Visitor;

public interface Expressao {

	public int avalia();
	public void aceita(Visitor visitor);
	
}
