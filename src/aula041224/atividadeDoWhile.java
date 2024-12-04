package aula041224;

import java.util.Scanner;

public class atividadeDoWhile {

	public static void main(String[] args) {

		int numero, soma = 0;
		Scanner leia = new Scanner(System.in);

		do { // bloco de repetição

			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) { // irá junta apenas n° maiores que 0 e soma
				soma += numero;
			}

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + soma); //print do soma
		
		leia.close();
	}
}
