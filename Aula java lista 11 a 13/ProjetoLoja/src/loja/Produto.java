package loja;

public class Produto {
	private String nome;
	private double preço;
	private int estoque;
	
	public void getDadosBasicos() {
		System.out.printf(
				"==== Dados ====\n" +
				"Nome: %s%n" +
				"Preço: R$ %.2f%n" +
				"Qtd em Estoque: %d",
				nome, preço, estoque);
	}
		
	
	// GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !nome.trim().isBlank()) {
			this.nome = nome;
		}else {
			System.out.println("Nome inválido");
		}
	}
	
	
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		if(preço > 0) {
			this.preço = preço;
		}else {
			System.out.println("Preço Inválido.");
		}
	}
	
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if(estoque >= 0) {
			this.estoque = estoque;
		}else {
			System.out.println("Quantidade Inválida.");
		}
	}
	
	
}
