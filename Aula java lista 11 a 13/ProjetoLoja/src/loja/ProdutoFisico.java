package loja;

public class ProdutoFisico extends Produto{
	private double Peso;
	private double Frete;
	
	public void getDadosBasicos() {
		getDadosBasicos();
		System.out.printf(
				"Peso: %.2f kg%n" +
				"Valor do Frete: R$ %.2f%n",
				Peso, Frete);
	}
	
	public double getPreçoTotal (double Preço, double Frete) {
		return Preço + Frete;
	}

	
	//Getters e Setters
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double Peso) {
		if(Peso > 0) {
			this.Peso = Peso;
		} else {
			System.out.println("Peso Inválido.");
		}
	}
	
	
	public double getFrete() {
		return Frete;
	}
	public void setFrete(double Frete) {
		if(Frete >= 0) {
			this.Frete = Frete;
		} else {
			System.out.println("Valor de Frete Inválido.");
		}
	}
	
	
}
