package redeSocial;

public class App {

	public static void main(String[] args) {
		Usuario x1 = new Usuario();
		Postagem x2 = new Postagem();
		Comentario x3 = new Comentario();
		MensagemPrivada x4 = new MensagemPrivada();
		Grupo x5 = new Grupo();
		
		x1.nome = "Ana";
		x1.idade = "17";
		x1.cidade = "Valença";
		
		x1.mostrarPerfil();
		
		x2.texto = "Estudando Java hoje!";
		x2.curtidas = 15;
		x2.autor = "Ana";
		
		x2.mostrarPostagem(); 
		
		x3.autor = "Bruno";
		x3.mensagem = "Muito bom esse post!";
		x3.likes = 4;
		
		x3.mostrarComentario();
		
		x4.remetente = "Ana";
		x4.destinatario = "Carlos";
		x4.conteudo = "Oi tudi bem?";
		
		x4.mostrarMensagem();
		
		x5.nomeGrupo = "Amigos do java";
		x5.tema = "Programação";
		x5.QuantidadeDeMembros = 28;
		
		x5.mostrarGrupo();
		

	}

}
