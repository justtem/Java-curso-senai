package loja;

public class Pedidos {
	private String cliente;
	private Produto produto;
	private int estoque;
	
	public void getExibirResumoPedido() {
		System.out.println(
				"==== Resumo do Pedido ====\n" +
				"Cliente: " + cliente + "\n" +
				"Prouto: " + produto.getNome());
		
		if(produto instanceof ProdutoFisico) {
			ProdutoFisico physicalProduct = (ProdutoFisico) produto;
			
			System.out.println(
					"Tipo: Produto Físico\n" +
					"Valor do Frete Individual: R$ " + physicalProduct.getFrete() + "\n" +
					"Valor Total do Pedido: R$ " + (physicalProduct.getPreçoTotal(produto.getPreço(), physicalProduct.getFrete()) * estoque));
		}else if(produto instanceof ProdutoDigital){
			ProdutoDigital digitalProduct = (ProdutoDigital) produto;
			
			System.out.println(
					"Valor do Pedido: R$ " + produto.getPreço() + "\n" +
					"Formato do Arquivo: " + digitalProduct.getFormatoDoArquivo() + "\n" +
					"Tamanho do Arquivo: " + digitalProduct.getTamanhoDoArquivo());
			
		}
	}
	
	
	//GETTERS e SETTERS
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		if(cliente != null && !cliente.trim().isBlank()) {
			this.cliente = cliente;
		}else {
			System.out.println("Nome de Cliente Inválido.");
		}
	}
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		if(produto != null) {
			this.produto = produto;
		} else {
			System.out.println("Produto Inválido");
		}
	}
	
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if(estoque > 0) {
			this.estoque = estoque;
		}else {
			System.out.println("Quantidade Inválida.");
		}
	}
}
