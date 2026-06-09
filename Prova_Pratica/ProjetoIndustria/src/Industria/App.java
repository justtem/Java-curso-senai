package Industria;

public class App {

	public static void main(String[] args) {
		MaquinaCorte MaquinaCorte = new MaquinaCorte();
		
		MaquinaCorte.setNome("Cortadora CNC 05");
		MaquinaCorte.setSetor("Corte");
		MaquinaCorte.setStatus("Em operação");
		MaquinaCorte.setTipoCorte("Laser");
		
		MaquinaSolda MaquinaSolda = new MaquinaSolda();
		
		MaquinaSolda.setNome("Soldador MIG 09");
		MaquinaSolda.setSetor("Soldagem");
		MaquinaSolda.setStatus("Disponivel");
		MaquinaSolda.setTipoSolda("MIG");
		
		OrdemServico ODS1 = new OrdemServico();
		ODS1.setResponsavel("Adriano");
		ODS1.setMaquina(MaquinaCorte);
		ODS1.getExibirResumoOrdem();
		
		OrdemServico ODS2 = new OrdemServico();
		ODS2.setResponsavel("Wesley");
		ODS2.setMaquina(MaquinaSolda);
		ODS2.getExibirResumoOrdem();
		
	}

}
