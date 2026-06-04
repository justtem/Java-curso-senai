package loja;

public class ProdutoDigital extends Produto{
	private double TamanhoDoArquivo;
	private String FormatoDoArquivo;
	
	public void getDadosBasicos() {
		getDadosBasicos();
		System.out.printf(
				"Tamanho do Arquivo: %.2f%n" +
				"Formato do Arquivo: %s%n",
				TamanhoDoArquivo, FormatoDoArquivo);
	}
	
	
	//GETTERS e SETTERS
	public double getTamanhoDoArquivo() {
		return TamanhoDoArquivo;
	}
	public void setTamanhoDoArquivo(double TamanhoDoArquivo) {
		if(TamanhoDoArquivo > 0) {
			this.TamanhoDoArquivo = TamanhoDoArquivo;
		} else {
			System.out.println("Formato Inváido.");
		}
	}
	
	
	public String getFormatoDoArquivo() {
		return FormatoDoArquivo;
	}
	public void setFormatoDoArquivo(String FormatoDoArquivo) {
		if(FormatoDoArquivo != null && !FormatoDoArquivo.trim().isBlank()) {
			this.FormatoDoArquivo = FormatoDoArquivo;
		}else {
			System.out.println("Formato Inválido.");
		}
	}
	
	
}
