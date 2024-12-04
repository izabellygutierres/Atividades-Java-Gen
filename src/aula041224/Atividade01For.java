package aula041224;

import java.util.Scanner;

public class Atividade01For {

	public static void main(String[] args) {
		int numeros;
		int pares = 0;
		int impares = 0;
		int contador = 1;
		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador < 11; contador++) {
			System.out.print("Digite o " + contador + "º número: ");
			numeros = leia.nextInt();

			if (numeros % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);

		leia.close();
	}

}
