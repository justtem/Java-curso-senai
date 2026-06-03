package Transporte;

public class Veiculo {
     private String marca;
     private String ano;
     
	 public String getMarca() {
		 return marca;
	 }
	 public void setMarca(String marca) {
		 if (marca != null && !marca.trim().isBlank()) {
			 this.marca = marca;			 
		 } else { 
			 System.out.println("Invalido!");
		 }
	 }
	 public String getAno() {
		 return ano;
	 }
	 public void setAno(String ano) {
		 if (ano != null && !ano.trim().isBlank()) {
			 this.ano = ano;			 
		 } else {
			 System.out.println("Invalido!");
		 }
	 }
     
     
}
