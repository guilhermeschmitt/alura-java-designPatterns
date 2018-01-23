package designPatterns.teste;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;
import designPatterns.tiposDeImpostos.ICMS;
import designPatterns.tiposDeImpostos.ImpostoMuitoAlto;

public class TesteDeImpostos {

	public static void main(String[] args) {
        Imposto impostos = new ImpostoMuitoAlto(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
    }
	
}
