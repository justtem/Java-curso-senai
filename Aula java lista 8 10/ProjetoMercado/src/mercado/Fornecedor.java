package mercado;

public class Fornecedor {
    
   private String nome;
   private String telefone;
   private String cidade;
   
   //Nome
   public String getnome() {
	   return nome;
   }
   
   public void setnome(String nome) {
	   if (nome != null && !nome.isEmpty()) {
		   this.nome = nome;
	   } else {
		   System.out.println("O espaço do nome não pode ficar vazio.");
	   }   
   }
   
   //Telefone
   public String gettelefone() {
	   return telefone;
   }
   
   public void settelefone(String telefone) {
	   if (telefone != null && !telefone.isEmpty()) {
		   this.telefone = telefone;
	   } else {
		   System.out.println("O espaço do telefone não pode ficar vazio.");
	   }  
   }
   
   //Cidade
   public String getcidade() {
	   return cidade;
   }
   
   public void setcidade(String cidade) {
	   if (cidade != null && !cidade.isEmpty()) {
		   this.cidade = cidade;
	   } else {
		   System.out.println("O espaço do nome não pode ficar vazio.");
	   }  
   }
}
