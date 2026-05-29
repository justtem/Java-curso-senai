package clinica;

public class Paciente {
   
	private String nome;
	private int idade;
	private double peso;
	
	//Nome
	public String getNome() {
    	return nome;
    } 
    
    public void setnome(String Nome) {
    	this.nome = Nome;
    }
    
    //Idade
    public int getIdade() {
    	return idade;
    }
    
    public void setidade(int Idade) {
    	if (idade < 0) {
    		System.out.println("o valor inserido não e valido");
    	} else {
    		this.idade = Idade;
    	}
    }
    
    //Preço
    public double getPeso() {
    	return peso;
    }
    
    public void setPeso(double Peso) {
    	if (peso < 0) {
    		System.out.println("O valor inserido não e valido.");
    	} else {
    		this.peso = Peso;
    	}
    }
}
