package redeSocial;

public class Postagem {
    
	String texto;
	int curtidas;
	String autor;
	
	void mostrarPostagem() {
		System.out.println("Texto: " + texto);
		System.out.println("Custidas: " + curtidas);
		System.out.println("Autor: " + autor);
		System.out.println(" ");
	}
}
