package industria;

public class RoboSolda extends Maquina {
    private int quantidadeEixos;

	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		if (quantidadeEixos < 0) {
			System.out.println("Invalido a quantidade de eixos!");
		} else {
			this.quantidadeEixos = quantidadeEixos;			
		}
	}
    @Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Quantidade de eixos do robô: " + quantidadeEixos + "\n");
	}
    
    @Override
    public void realizarManutenção() {
    	super.realizarManutenção();
    	System.out.println("Calibracao dos eixos e verificacao do sistema de solda realizadas");
    }
    
}
