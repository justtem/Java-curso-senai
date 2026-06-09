package Industria;

public class OrdemServico {
    private String responsavel;
    private Maquina maquina;
    
   public void getExibirResumoOrdem() {
	   
	   System.out.println("\nResponsavel: " + responsavel);
	   
	   if (maquina instanceof MaquinaCorte) {
		    MaquinaCorte maquina1 = (MaquinaCorte) maquina;
		    maquina1.exibirMaquinaCorte();
		    
	   } else if (maquina instanceof MaquinaSolda) {
		   MaquinaSolda maquina2 = (MaquinaSolda) maquina;
		   maquina2.exibirMaquinaSolda();
	   }
   }

   public String getResponsavel() {
	return responsavel;
   }

   public void setResponsavel(String responsavel) {
	   if (responsavel == null || responsavel.trim().isEmpty()) {
		   System.out.println("Invalido.");
	   } else {
		   this.responsavel = responsavel;		   
	   }
   }

   public Maquina getMaquina() {
	return maquina;
   }

   public void setMaquina(Maquina maquina) {
	   if (maquina == null) {
		   System.out.println("Invalido.");
	   } else {
		   this.maquina = maquina;		   
	   }
   }
    	
   
    
}
