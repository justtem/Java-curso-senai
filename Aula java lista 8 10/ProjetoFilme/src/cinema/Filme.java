package cinema;

public class Filme {
    
	private String titulo;
	private int duracao;
	private int classeficacaoIndicativa;
	private double nota;
	
	//Duração
	public int getDurocao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		if (duracao < 0) {
			System.out.println("Valor inválido");
		} else {
			this.duracao = duracao;
		}
	}
	
	//Classificação
	public int getclasseficacaoIndicativa() {
		return classeficacaoIndicativa;
	}
	
	public void setClasseFicacaoIndicativa(int classeficacaoIndicativa) {
		if (classeficacaoIndicativa % 2 != 0 || classeficacaoIndicativa < 6 || classeficacaoIndicativa > 18) {
			System.out.println("Classificação inválida!");
		} else {
			this.classeficacaoIndicativa = classeficacaoIndicativa;
		}
	}
	
	//Nota
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
		} else {
			this.nota = nota;
		}
	}
	
	//Titulo
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isEmpty()) {
			   this.titulo = titulo;
		   } else {
			   System.out.println("O espaço não pode ficar vazio.");
		   }  
	}
}
