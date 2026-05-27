package Lista;

import java.util.Scanner;

public class Lista_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int raio;
		
		System.out.println("Informe o raio: ");
		raio = entrada.nextInt();
		
		System.out.printf("Diâmetro: %d\n", 2 * raio);
        System.out.printf("Circuferência do círculo: %f\n", 2 * 3.14159 * raio);
        System.out.printf("Àrea docírcuito: %f\n", Math.PI * Math.pow(raio, 2));
	}

}
