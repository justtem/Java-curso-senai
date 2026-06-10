package Transporte;

public class Carro {
    private String modelo;
    private int ano;
    
    
	public Carro(String modelo, int ano) {
		this.modelo = "Não informado";
		this.ano = 0;
	}
    
	public void exibirCarro() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
}
