package loja;

public class App {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setnome("Notebook");
		produto.setpreco(35000.00);
		produto.setquantidadeEstoque(10);
		
		System.out.println("=== Dados do produto ==");
		System.out.println("nome: " + produto.getnome());
		System.out.println("Preço: " + produto.getpreço());
		System.out.println("Quantidade: " + produto.getquantidadeEstoque());
		
		Syste,.out.println(" ");
		
		
		

	}

}
