package designPatterns.builders;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import designPatterns.interfaces.AcaoAposGerarNota;
import designPatterns.models.ItemDaNota;
import designPatterns.models.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
    private String cnpj;

    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;
    
    private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
    
    public NotaFiscalBuilder(List<AcaoAposGerarNota> lista) {
        this.data = Calendar.getInstance();
        this.todasAcoesASeremExecutadas = lista;
    }
    
    public void adicionaAcao(AcaoAposGerarNota novaAcao) {
        this.todasAcoesASeremExecutadas.add(novaAcao);
      }
    
    
    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
    	this.razaoSocial = razaoSocial;
    	return this;
    }
    
    public NotaFiscalBuilder comCNPJ(String cnpj) {
    	this.cnpj = cnpj;
    	return this;
    }
    
    public NotaFiscalBuilder comItem(ItemDaNota item) {
    	this.todosItens.add(item);
    	this.valorBruto += item.getValor();
    	this.impostos += item.getValor() * 0.05;
    	
    	return this;
    }
    
    public NotaFiscalBuilder naData(Calendar novaData) {
    	this.data = novaData;
    	return this;
    }
    
    public NotaFiscalBuilder comObservacoes(String obs) {
    	this.observacoes = obs;
    	return this;
    }
    
    public NotaFiscal constroi() {
    	NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, valorBruto, impostos, data, observacoes, todosItens);
    	for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
            acao.executa(notaFiscal);
          }
    	
    	return notaFiscal;
    }
	
}
