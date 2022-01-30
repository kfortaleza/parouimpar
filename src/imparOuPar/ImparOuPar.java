package imparOuPar;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		// Variáveis
		int numero;

		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Verificando se o número é par ou ímpar
		System.out.println("Digite o número:");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Esse número é par!");
		} else {
			System.out.println("Esse número é ímpar!");
		};
		
	}

}
