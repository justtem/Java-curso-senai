package industria;

public class OrdemManutencao {
    private String numero, descricao;
    private Maquina maquina;
    private Tecnico tecnico;
    
    public void exibirOrdem() {
    	System.out.println("Numero: " + numero);
    	System.out.println("Descrição: " + descricao + "\n");
    	maquina.exibirDados();
    	tecnico.exibirTecnico();
    	System.out.println("=== Maquina ===\n");
    }
    
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if (numero == null || numero.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.numero = numero;			
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao == null || descricao.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.descricao = descricao;			
		}
	}
	
	public Maquina getMaquina() {
		return maquina;
	}
	public void setMaquina(Maquina maquina) {
		if (maquina == null) {
			System.out.println("Invalido!");
		} else {
			this.maquina = maquina;			
		}
	}
	
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		if (tecnico == null) {
			System.out.println("Invalido!");
		} else {
			this.tecnico = tecnico;						
		}
	}
    
    
}
