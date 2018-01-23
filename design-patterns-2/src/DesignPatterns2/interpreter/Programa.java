package DesignPatterns2.interpreter;

import DesignPatterns2.visitor.ImpressoraVisitor;
import DesignPatterns2.visitor.PreFixaVisitor;

public class Programa {

	public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));

        Expressao conta = new Divisao(direita, esquerda);
        Expressao conta2 = new RaizQuadrada(new Numero(9));

        int resultado = conta.avalia();
        System.out.println(resultado);
        System.out.println(conta2.avalia());
        
        ImpressoraVisitor visitor = new ImpressoraVisitor();
        PreFixaVisitor preFixaVisitor = new PreFixaVisitor();
        
        conta.aceita(preFixaVisitor);
        System.out.println();
        conta2.aceita(visitor);
    }
	
}
