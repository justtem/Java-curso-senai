package mercado;

public class Item {
    
	private String descricao;
	private double preco;
	private int quantidade;
	
	//Descrição
    public String getdescricao() {
    	return descricao;
    } 
    
    public void setdescricao(String descricao) {
    	this.descricao = descricao;
    }
    
    //Preço
    public double getPreco() {
    	return preco;
    }
    
    public void setPreco(double preco) {
    	if (preco < 0) {
    		System.out.println("O valor inserido não e valido.");
    	} else {
    		this.preco = preco;
    	}
    }
    
    //Quantidade
    public int getQuantidade() {
    	return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
    	if (quantidade <= 0) {
    		System.out.println("o valor inserido não e valido");
    	} else {
    		this.quantidade = quantidade;
    	}
    }
    
}
