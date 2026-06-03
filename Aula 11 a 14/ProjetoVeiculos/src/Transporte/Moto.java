package Transporte;

public class Moto extends Veiculo{
     private boolean descansoAtivo;

	 public boolean isDescasoAtivo() {
		 return descansoAtivo;
	 }

	 public void setDescasoAtivo(boolean descansoAtivo) {
		 if (descansoAtivo == true) {
			 this.descansoAtivo = descansoAtivo;
			 System.out.println("Descanso da moto acionado");
		 } 
	 }
     
     
}
