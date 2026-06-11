package industria;

public class App {

	public static void main(String[] args) {
		Esteira et1 = new Esteira();
		
		et1.setNome("Esteira 7");
		et1.setCodigo("007");
		et1.setStatus("Operando");
		et1.setVelocidade(2);
		
		Esteira et2 = new Esteira();
        
		et2.setNome("Esteira 2");
		et2.setCodigo("12345");
		et2.setStatus("Parada");
		et2.setVelocidade(0);
		
		RoboSolda RS = new RoboSolda();
		
		RS.setNome("Frank");
		RS.setCodigo("4267");
		RS.setQuantidadeEixos(4);
		RS.setStatus("Operando");
		
		Torno T1 = new Torno();
		
		T1.setNome("Torno");
		T1.setCodigo("0606");
		T1.setVelocidadeGiro("3");
		T1.setStatus("Operando");
		
		Tecnico TC = new Tecnico();
		
		TC.setNome("Valdemar");
		TC.setMatricula("654321");
		TC.setEspecialidade("Chapa");
		
	    OrdemManutencao OM = new OrdemManutencao();
	    
	    OM.setNumero("1");
	    OM.setDescricao("Ordem 1");
	    OM.setMaquina(et1);
	    OM.setTecnico(TC);
	    OM.exibirOrdem();
	    
	    OrdemManutencao OM2 = new OrdemManutencao();
	    
	    OM2.setNumero("2");
	    OM2.setDescricao("Ordem 2");
	    OM2.setMaquina(et2);
	    OM2.setTecnico(TC);
	    OM2.exibirOrdem();
	    	
	    OrdemManutencao OM3 = new OrdemManutencao();
	    OM3.setNumero("3");
	    OM3.setDescricao("Ordem 4");
	    OM3.setMaquina(T1);
	    OM3.setTecnico(TC);
	    OM3.exibirOrdem();
	}
	
	 

}
