package clinica;

public class Medico {
   
	private String nome;
	private String especialidade;
	private double valorConsulta;
	
	//Nome
	public String getNome() {
    	return nome;
    } 
    
    public void setnome(String Nome) {
    	this.nome = Nome;
    }
	
	//Especialidade
	public String getEspecialidade() {
		   return especialidade;
	   }
	   
	   public void setEspecialidade(String especialidade) {
		   if (especialidade != null && !especialidade.isEmpty()) {
			   this.especialidade = especialidade;
		   } else {
			   System.out.println("O espaço do nome não pode ficar vazio.");
		   }   
	   }
	   
	   //Valor da consulta
	    public double getValorConsulta() {
	    	return valorConsulta;
	    }
	    
	    public void setvalorConsulta(double ValorConsulta) {
	    	if (valorConsulta < 0) {
	    		System.out.println("O valor inserido não e valido.");
	    	} else {
	    		this.valorConsulta = ValorConsulta;
	    	}
	    }
}
