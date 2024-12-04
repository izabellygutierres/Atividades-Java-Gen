package aula031224;

import java.util.Scanner;

public class exercicioCondicional01 {

	public static void main(String[] args) {
		
		float A;
		float B;
		float C;
		float soma;
		
		Scanner leia = new Scanner(System.in); 

		System.out.println("Digite o valor A: ");
		A = leia.nextFloat();
		
		System.out.println("Digite o valor B: ");
		B = leia.nextFloat();
		
		System.out.println("Digite o valor C: ");
		C = leia.nextFloat();
		
		soma = A+ B;
	
		
		if(soma > C) {
			System.out.printf("%.1f + %.1f = %.1f %s %.1f\n", A, B, soma, (soma > C ? ">" : "<="), C);
			System.out.printf("A soma de A + B = %.1f é maior que o valor C.", soma);
		}else if (soma < C){
			System.out.printf("%.1f + %.1f = %.1f %s %.1f\n", A, B, soma, (soma > C ? ">" : "<="), C);
			System.out.printf("A soma de A + B = %.1f é menor que o valor C.",soma);	
		}else {
			System.out.printf("%.1f + %.1f = %.1f %s %.1f\n", A, B, soma, (soma > C ? ">" : "<="), C);
			System.out.printf("A soma de A + B = %.1f é igual ao valor C.", soma);

		}
		
		leia.close();
	}

}
