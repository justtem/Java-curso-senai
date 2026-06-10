package comercio;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto() {
    	nome = "Padrão";
    	preco = 0.0;
    	estoque = 0;
    }

	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = 0;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
    
	public void exibirProduto() {
		System.out.printf("Produto: %s%n", nome);
		System.out.printf("Preço R$: %.2f%n",preco);
		System.out.printf("Estoque: %d%n", estoque);
	}
	
    
}
