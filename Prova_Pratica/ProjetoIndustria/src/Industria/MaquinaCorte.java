package Industria;

public class MaquinaCorte extends Maquina {
    private String tipoCorte;

	public String getTipoCorte() {
		return tipoCorte;
	}

	public void setTipoCorte(String tipoCorte) {
		if (tipoCorte == null || tipoCorte.trim().isEmpty()) {
			System.out.println("Invalido.");
		} else {
			this.tipoCorte = tipoCorte;			
		}
	}
    
    public void exibirMaquinaCorte() {
    	exibirDadosBasicos();
    	System.out.println("Tipo do corte: " + tipoCorte);
    }
	
}
