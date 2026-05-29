package mercado;

public class App {

	public static void main(String[] args) {
		Item item = new Item();
		Fornecedor fornecedor = new Fornecedor();
		
       
		item.setdescricao("aspira com vapor");
		item.setPreco(139.99);
		item.setQuantidade(10);
		
		fornecedor.setnome("PóDeCrê");
		fornecedor.settelefone("249922070");
		fornecedor.setcidade("Pó serra grande");
		
		System.out.println("=== Detalhes do item ===");
		System.out.println("Descrição: " + item.getdescricao());
		System.out.println("Preço: " + item.getPreco());
		System.out.println("Quantidade: " + item.getQuantidade());
		
		System.out.println(" ");
		
		System.out.println("=== Detalhes do fornecedor ===");
		System.out.println("Nome: " + fornecedor.getnome());
		System.out.println("Telefone: " + fornecedor.gettelefone());
		System.out.println("Cidade: " + fornecedor.getcidade());
	}

}
