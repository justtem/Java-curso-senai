package Util;

public class Desenvolvedor extends Funcionarios{
    private double hExtra;

	public double gethExtra() {
		return hExtra;
	}

	public void sethExtra(double hExtra) {
		if (hExtra < 0) {
			System.out.println("Hora invalida!");
		} else {
			this.hExtra = hExtra;
		}
	}
    @Override
    public void calcularSalario() {
    	System.out.printf("Salário final: R$%.2f%n" , getSalarioBase() + (hExtra * 50));
    }
	
}
