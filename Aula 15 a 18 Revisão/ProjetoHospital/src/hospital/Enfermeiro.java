package hospital;

public class Enfermeiro extends Profissional{
    private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		if (setor == null || setor.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.setor = setor;
		}
	}
    
	public void exibirEnfermeiro() {
		exibirDadosBasicos();
		System.out.println("setor: " + setor);
	}
    
}
