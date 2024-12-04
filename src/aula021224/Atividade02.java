package aula021224;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) { //Atividade Notas de Participantes
	
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada de notas pelo usuario
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();
		
		//processamento de media das notas (NOTA1 + NOTA2 + NOTA3 + NOTA4) / 4
		media = (nota1+nota2+nota3+nota4)/4;
		
		//saida do resultado - media
		System.out.printf("Media das notas: %.1f", media);	
		
		leia.close();
	}

}
