package hospital;

public class Consulta {
    private String paciente;
    private Profissional responsavel;
    
    public void getConsulta() {
    	System.out.println("\n=== Consulta ===\n" + "Paciente: " + paciente + "\n");
        
    	if (responsavel instanceof Medico) {
    	    Medico medico = (Medico) responsavel;
    	    medico.exibirMedico();
    	    
    	} else if (responsavel instanceof Enfermeiro) {
    		Enfermeiro enfermeiro = (Enfermeiro) responsavel;
    		enfermeiro.exibirEnfermeiro();
    	}
    }
    
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		if (paciente == null || paciente.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.paciente = paciente;
		}
	}
	
	public Profissional getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Profissional responsavel) {
		if (responsavel == null) {
			System.out.println("Invalido!");
		} else {
			this.responsavel = responsavel;
		}
	}
    
}
