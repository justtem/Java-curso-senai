package loja;

public class Produto {
    
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
   
	public double getpreço() {
		return preco;
	}
	public void setpreco(double preco) {
		if (preco < 0) {
			System.out.println("O valor deve ser maior que R$ 00,00");
		} else {
			this.preco = preco;
		}
	}
	

	
	public int getquantidadeEstoque(int quantidadeEstoque ) {
		return quantidadeEstoque;
    }
    
    public void setquantidadeEstoque(int quantidadeEstoque) {
    	
    	if (quantidadeEstoque <= 0) {
    		System.out.println("A quantidade em estoque esta indisponivel!");
    	} else {
    		this.quantidadeEstoque = quantidadeEstoque;
    	}
    }
}
