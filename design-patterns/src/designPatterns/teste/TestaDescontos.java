package designPatterns.teste;

import designPatterns.implementadores.CorrenteDeDescontos;
import designPatterns.models.Item;
import designPatterns.models.Orcamento;

public class TestaDescontos {

	public static void main(String[] args) {
        CorrenteDeDescontos calculador = new CorrenteDeDescontos();

            Orcamento orcamento = new Orcamento(500.0);
            orcamento.adicionaItem(new Item("CANETA", 250.0));
            orcamento.adicionaItem(new Item("LAPIS", 250.0));

            double desconto = calculador.calcula(orcamento);

            System.out.println(desconto);

      }
	
}
