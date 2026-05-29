package cinema;

public class App {

	public static void main(String[] args) {
		Filme filme1 = new Filme();
		
		filme1.setTitulo("Todo mundo em pânico");
		filme1.setDuracao(78);
		filme1.setClasseFicacaoIndicativa(18);
		filme1.setNota(6.3);
		
		Filme filme2 = new Filme();
		
		filme2.setTitulo("Rubber, O Pneu Assassino");
		filme2.setDuracao(75);
		filme2.setClasseFicacaoIndicativa(16);
		filme2.setNota(5.7);
		
		
		System.out.println("=== Informações do filme ===");
		System.out.println("Titulo: " + filme1.getTitulo());
		System.out.println("Duração: " + filme1.getDurocao());
		System.out.println("Classificação indicativa: " + filme1.getclasseficacaoIndicativa());
		System.out.println("Nota: " + filme1.getNota());
        
		System.out.println(" ");
		
		System.out.println("=== Informações do filme ===");
		System.out.println("Titulo: " + filme2.getTitulo());
		System.out.println("Duração: " + filme2.getDurocao());
		System.out.println("Classificação indicativa: " + filme2.getclasseficacaoIndicativa());
		System.out.println("Nota: " + filme2.getNota());
	}
	
	    

}
