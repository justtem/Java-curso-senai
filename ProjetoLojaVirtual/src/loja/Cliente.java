package loja;

public class Cliente {
     
	private String nome;
	private int idade;
	private String Email;
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		if (idade < 18) {
			System.out.println("Você não e maior de idade!");
		} else {
			this.idade = idade;
		}
	}
		
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		if (email != null && !email.isEmpty()) {
			this.Email = email;
		} else {
			System.out.println("O espaço do email não pode ficar vazio.");
		}
	    
	}
	
}