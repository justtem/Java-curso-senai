package hospital;

public class Profissional {
    private String nome;
    private String registro;
    private String turno;
    
    
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
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		if (registro == null || registro.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.registro = registro;
		}
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		if (turno == null || turno.trim().isEmpty()) {
			System.out.println("Invalido!");
		} else {
			this.turno = turno;
		}
	}
	
	public void exibirDadosBasicos() {
		System.out.println("Nome: " + nome);
		System.out.println("Rgistro: " + registro);
		System.out.println("Turno: " + turno);
	}
    
    
}
