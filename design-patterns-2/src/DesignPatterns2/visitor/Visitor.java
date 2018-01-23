package DesignPatterns2.visitor;

import DesignPatterns2.interpreter.Divisao;
import DesignPatterns2.interpreter.Multiplicacao;
import DesignPatterns2.interpreter.Numero;
import DesignPatterns2.interpreter.RaizQuadrada;
import DesignPatterns2.interpreter.Soma;
import DesignPatterns2.interpreter.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaNumero(Numero numero);

	void visitaDivisao(Divisao divisao);

	void visitaMultiplicacao(Multiplicacao multiplicacao);

	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);

	
	
}
