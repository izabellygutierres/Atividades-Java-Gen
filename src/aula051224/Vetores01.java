package aula051224;

import java.util.Scanner;

public class Vetores01 {

	public static void main(String[] args) {

		int[] num = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }; //Vetor de numeros
		int numeroProcura;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");
		numeroProcura = leia.nextInt();

		// procura o numero percorrendo o vetor 
		for (int cont = 0; cont < num.length; cont++) {
			if (num[cont] == numeroProcura) {
				encontrado = true;
				System.out.println("O número " + numeroProcura + " está localizado na posição: " + cont);
				break;
			}
		}

		if (!encontrado) { //caso não encotre o numero dado pelo usuario
			System.out.println("O número " + numeroProcura + " não foi encontrado!");

		}
		leia.close();
	}

}
