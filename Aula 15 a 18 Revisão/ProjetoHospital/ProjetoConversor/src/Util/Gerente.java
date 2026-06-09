package Util;

public class Gerente extends Funcionarios {
    private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if (bonus < 0) {
			System.out.println("Bonus invalido!");
		} else {
			this.bonus = bonus;			
		}
	}
    @Override
    public void calcularSalario() {
    	System.out.printf("Salário: %.2f%n" , getSalarioBase() + bonus);
    }
	
}
