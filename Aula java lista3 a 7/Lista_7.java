package Lista_7;

import java.util.Scanner;

public class Lista_7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		float PrecoDaGasosa = 6.66f;
		float GastoDaGasosa;
		float KmPorL;
		float KmTotaisL;
		float TaxaEstacionamentoD;
		float Pedagio;
		
		System.out.printf("Quilômetros totais: ");
		KmTotaisL = entrada.nextInt();
	
		System.out.printf("Preço da gasolina: %.2f\n", PrecoDaGasosa);
		
		System.out.printf("Litros de gasolina: ");
		GastoDaGasosa = entrada.nextInt();
	    
	    System.out.printf("Quilômetros médios por litro: ");
	    KmPorL = entrada.nextInt();
	    
	    System.out.printf("Valo do estacionamento diário: ");
	    TaxaEstacionamentoD = entrada.nextInt();
		
        System.out.printf("Valor do pedágio: ");
        Pedagio = entrada.nextInt();
        
        float consumoMedío = (KmTotaisL / GastoDaGasosa);
        float consumoDiário = ((KmTotaisL / consumoMedío) * PrecoDaGasosa) + TaxaEstacionamentoD + Pedagio;
        
        System.out.printf("O seu custo medío para dirigir será: %.2f\n", consumoDiário);
	}
}
