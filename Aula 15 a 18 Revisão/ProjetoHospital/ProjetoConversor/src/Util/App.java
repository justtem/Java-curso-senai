package Util;

public class App {

	public static void main(String[] args) {
		Gerente G1 = new Gerente();
		
		G1.setNome("Marcelo");
		G1.setSalarioBase(11500);
		G1.setBonus(1500);
		G1.calcularSalario();
		
		Desenvolvedor D1 = new Desenvolvedor();
		
		D1.setNome("Marcos");
		D1.setSalarioBase(1612);
		D1.sethExtra(50);
		D1.calcularSalario();
		
	}

}
