package industria;

public class Torno extends Maquina {
    private String velocidadeGiro;
    

	public String getVelocidadeGiro() {
		return velocidadeGiro;
	}

	public void setVelocidadeGiro(String velocidadeGiro) {
		if (velocidadeGiro == null || velocidadeGiro.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.velocidadeGiro = velocidadeGiro;			
		}
	}

	 @Override
		public void exibirDados() {
			super.exibirDados();
			System.out.println("Velocidade de giro: " + velocidadeGiro);
		}
	    
	    @Override
	    public void realizarManutenção() {
	    	super.realizarManutenção();
	    	System.out.println("Calibracao do cabeçote e verificacao do sistema de rotação realizadas");
	    }
	
}
