package industria;

public class Tecnico {
    private String nome;
    private String matricula;
    private String especialidade;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.nome = nome;			
		}
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if (matricula == null || matricula.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.matricula = matricula;			
		}
	}
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
    
    public void exibirTecnico() {
    	System.out.println("=== Tencico ===\n");
    	System.out.println("Nome: " + nome);
    	System.out.println("Matricula: " + matricula);
    	System.out.println("Especialidade: " + especialidade + "\n");
    	
    }
    
}
