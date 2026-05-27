package Lista_4;

import java.util.Scanner;

public class Lista_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x;
		int y;
		int multi;
		int soma;
		int subtracao;
		int divisao;
		
		System.out.print("Informe o primeiro número inteiro: ");
		x = entrada.nextInt();
		
		System.out.print("Informe o segunda número inteiro: ");
		y = entrada.nextInt();
		
		
        System.out.printf("Soma: %d\n", soma = x + y);
        System.out.printf("Produto: %d\n", subtracao = x - y);
        System.out.printf("Diferença: %d\n", multi = x * y);
        System.out.printf("Quociente: %d\n", divisao = x / y);
	}

}
