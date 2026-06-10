package comercio;

public class App {

	public static void main(String[] args) {
		Produto P1 = new Produto();
		P1.exibirProduto();
		
		Produto P2 = new Produto("Rexona", 17.99, 10);
	    P2.exibirProduto();
		
 		Produto P3 = new Produto("Dove", 20.99);
        P3.exibirProduto();

	}

}
