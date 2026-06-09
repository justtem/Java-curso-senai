package Industria;

public class Maquina {
    private String nome;
    private String setor;
    private String status;
    
    
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
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		if (setor == null || setor.trim().isEmpty()) {
			System.out.println("Invalido.");
		}
		this.setor = setor;
	}
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if (status == null || status.trim().isEmpty()) {
			System.out.println("Invalido.");
		} else {
			this.status = status;			
		}
	}
	public void exibirDadosBasicos() {
		System.out.println("Nome: " + nome);
		System.out.println("Setor: " + setor);
		System.out.println("Status: " + status);
	}
    
}
