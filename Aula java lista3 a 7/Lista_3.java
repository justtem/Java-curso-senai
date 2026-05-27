package Lista2;

import java.util.Scanner;

public class Lista_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int resultado;
		
		System.out.print("Informe o primeiro número inteiro: ");
		x = entrada.nextInt();
		
		System.out.print("Informe o segunda número inteiro: ");
		y = entrada.nextInt();
		
		System.out.print("Informe o terceira número inteiro: ");
		z = entrada.nextInt();
		
		resultado = x + y + z;
		
		System.out.printf("Produto: %d", resultado);

	}

}
