package redeSocial;

public class Grupo {
    
	String nomeGrupo;
	String tema;
	int QuantidadeDeMembros;
	
	void mostrarGrupo() {
		System.out.println("Nome do grupo : " + nomeGrupo);
		System.out.println("Tema: " + tema);
		System.out.println("Quantidade de membros: " + QuantidadeDeMembros);
		System.out.println(" ");
	}
}
