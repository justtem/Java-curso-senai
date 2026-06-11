package industria;

public class Esteira extends Maquina {
    private int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		if (velocidade < 0) {
			System.out.println("Velocidade Invalida!");
		} else {			
			this.velocidade = velocidade;
		}
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Velocidade: " + velocidade + "\n");
	}
	
	@Override
	public void realizarManutenção() {
		super.realizarManutenção();
		System.out.println("Lubrificação e ajuste de alinhamento da esteira realizados");
	}
    
}
