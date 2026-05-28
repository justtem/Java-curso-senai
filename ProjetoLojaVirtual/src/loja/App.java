package loja;

public class App {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setnome("Notebook");
		produto.setpreco(35000.00);
		produto.setquantidadeEstoque(10);
		
		System.out.println("=== Dados do produto ==");
		System.out.println("nome: " + produto.getnome());
		System.out.println("Preço: R$" + produto.getpreço());
		System.out.println("Quantidade: " + produto.getquantidadeEstoque());
		
		System.out.println();
		
		Cliente cliente = new Cliente();
		
		cliente.setnome("Ana");
		cliente.setidade(25);
		cliente.setEmail("ana@gmail.com");
		
		System.out.println("=== Dados do Cliente ===");
		System.out.println("Nome: " + cliente.getnome());
		System.out.println("Idade: " + cliente.getidade());
		System.out.println("Email: " + cliente.getEmail());
		
		System.out.println();
		
		System.out.println("=== Testando valores inválidos ===");
		
		produto.setpreco(-100);
		produto.setquantidadeEstoque(-5);
		
		cliente.setidade(-10);
		cliente.setEmail("");

	}

}