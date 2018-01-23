package designPatterns.implementadores;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto tipoDeImposto) {

		double resultado = tipoDeImposto.calcula(orcamento);

		System.out.println(resultado);

	}

}
