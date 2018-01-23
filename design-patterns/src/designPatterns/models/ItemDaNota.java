package designPatterns.models;

public class ItemDaNota {

	private String descricao;
	private double valor;
	
	public ItemDaNota(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	
    public double getValor() {
        return this.valor;
      }

      public String getDescricao() {
        return this.descricao;
      }
	
	
	
}
