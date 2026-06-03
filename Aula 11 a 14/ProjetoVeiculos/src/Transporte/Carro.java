package Transporte;

public class Carro extends Veiculo {
    private int quantidadePortas;
        
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		if (quantidadePortas > 0 && quantidadePortas <= 4) {
			this.quantidadePortas = quantidadePortas;			
		} else {
			System.out.println("Invalido");
		}
	}

	void exibirCarros() {
		System.out.print("Marca : " + getMarca());
		System.out.print("Ano: " + getAno());
		System.out.println("Quantidade de portas: " + getQuantidadePortas());
	}
    
}
