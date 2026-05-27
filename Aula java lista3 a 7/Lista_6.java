package Lista_5;

public class Lista_6 {

	public static void main(String[] args) {
		long PopulaçãoMundial = 8270000000L;
		int AnosFuturos = 5;
		
		for(int i = 1; i <= AnosFuturos; i++) {
			System.out.printf("População daqui a %d ano: %.0f\n", i, (PopulaçãoMundial * Math.pow(1 + 0.01, i)));
		}
		

	}

}
