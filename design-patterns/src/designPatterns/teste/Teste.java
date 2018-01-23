package designPatterns.teste;

import designPatterns.interfaces.Imposto;
import designPatterns.models.Orcamento;
import designPatterns.tiposDeImpostos.ICCC;

public  class Teste {
    public static void main(String[] args) {
      Orcamento reforma = new Orcamento(500.0);

      Imposto novoImposto = new ICCC();
      System.out.println(novoImposto.calcula(reforma));
    }
  }