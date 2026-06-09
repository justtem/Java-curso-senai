package Industria;

public class MaquinaSolda extends Maquina {
    private String tipoSolda;

	public String getTipoSolda() {
		return tipoSolda;
	}

	public void setTipoSolda(String tipoSolda) {
		if (tipoSolda == null || tipoSolda.trim().isEmpty()) {
			System.out.println("Invalido.");
		} else {
			this.tipoSolda = tipoSolda;			
		}
	}
    
    public void exibirMaquinaSolda() {
    	exibirDadosBasicos();
    	System.out.println("Tipo da solda: " + tipoSolda);
    }
	
}
