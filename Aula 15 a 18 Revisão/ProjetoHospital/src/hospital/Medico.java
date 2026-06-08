package hospital;

public class Medico extends Profissional {
    private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade == null || especialidade.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.especialidade = especialidade;
		}
	}
    
	public void exibirMedico() {
		exibirDadosBasicos();
		System.out.println("Especialidade: " + especialidade);
	}
    
}
