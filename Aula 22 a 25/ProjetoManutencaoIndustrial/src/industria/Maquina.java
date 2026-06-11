package industria;

public class Maquina {
    private String nome;
    private String codigo;
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
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		if (codigo == null || codigo.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.codigo = codigo;			
		}
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if (status.equals("Operando") ||
			status.equals("Parada") ||
			status.equals("Em manutenção")) {
			
			this.status = status;			
		} else {
			System.out.println("Erro ao executar!");
		}
	}
    
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Código: " + codigo);
		System.out.println("Status: " + status);
	}
	
	public void realizarManutenção() {
		System.out.println("Manutenção geral realizada!");
	}
	
}
