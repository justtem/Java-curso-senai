package loja;

public class App {

	public static void main(String[] args) {
		ProdutoFisico p1 = new ProdutoFisico();
		p1.setNome("Garrafa Stanley");
		p1.setPreço(40);
		p1.setFrete(5);
		
		ProdutoDigital p2 = new ProdutoDigital();
		p2.setNome("Zé carioca");
		p2.setPreço(7);
		p2.setFormatoDoArquivo("PDF");
		p2.setTamanhoDoArquivo(434.3);
		
		
		Pedidos pd1 = new Pedidos();
		pd1.setCliente("Carlinhos");
		pd1.setEstoque(5);
		pd1.setProduto(p1);
		
		Pedidos pd2 = new Pedidos();
		pd2.setCliente("Aninha");
		pd2.setEstoque(10);
		pd2.setProduto(p2);
		
		pd1.getExibirResumoPedido();
		System.out.println("");
		pd2.getExibirResumoPedido();
		
		
		
	}

}
