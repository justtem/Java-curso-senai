package Util;

public class Funcionarios {
    private String nome;
    private double salarioBase;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Invalido");
		} else {
			this.nome = nome;
		}
	}
	
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		if (salarioBase < 0) {
			System.out.println("Valor invalido!");
		} else {
			this.salarioBase = salarioBase;
		}
	}
	
    public void calcularSalario() {
    	System.out.println("Salário Base: R$" + salarioBase);
    }
    
}
