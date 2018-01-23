package DesignPatterns2.visitor;

import DesignPatterns2.interpreter.Divisao;
import DesignPatterns2.interpreter.Multiplicacao;
import DesignPatterns2.interpreter.Numero;
import DesignPatterns2.interpreter.RaizQuadrada;
import DesignPatterns2.interpreter.Soma;
import DesignPatterns2.interpreter.Subtracao;

public class PreFixaVisitor implements Visitor{

	@Override
	public void visitaSoma(Soma soma) {
		
		System.out.print(" + ");
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		soma.getDireita().aceita(this);
		System.out.print(")");
		
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print(" - ");
		System.out.print("(");
		subtracao.getEsquerda().aceita(this);
		subtracao.getDireita().aceita(this);
		System.out.print(")");
		
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
		
	}

	@Override
	public void visitaDivisao(Divisao divisao) {
		System.out.print(" / ");
		System.out.print("(");
		divisao.getEsquerda().aceita(this);
		divisao.getDireita().aceita(this);
		System.out.print(")");
		
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print(" * ");
		System.out.print("(");
		multiplicacao.getEsquerda().aceita(this);
		multiplicacao.getDireita().aceita(this);
		System.out.print(")");
		
	}

	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
		System.out.print(" ² ");
		System.out.print("(");
		raizQuadrada.getNumero().aceita(this);
		System.out.print(")");
		
	}

}
