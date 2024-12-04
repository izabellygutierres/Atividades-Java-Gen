package aula021224;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		//variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o 1° número: ");
		n1 = leia.nextFloat();
		System.out.print("Digite o 2° número: ");
		n2 = leia.nextFloat();
		System.out.print("Digite o 3° número: ");
		n3 = leia.nextFloat();
		System.out.print("Digite o 4° número: ");
		n4 = leia.nextFloat();
		
		//processamento 
		diferenca = (n1 * n2) - (n3 * n4);
		//saida
		System.out.printf("Diferença:  %.1f", diferenca);

		leia.close();
	}

}
